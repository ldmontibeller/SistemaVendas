/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nextlevel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import nextlevel.jdbc.ConnectionFactory;
import nextlevel.model.Clientes;

/**
 *
 * @author Leonardo Drews Montibeller at ldmontibeller@gmail.com
 */
public class ClientesDAO {
     //Atributos
    private Connection conexao;

    //Construtor
    public ClientesDAO() {
        //1º passo: disponibilizar uma conexão com o BD
        this.conexao = ConnectionFactory.getConnection();
    }
    
    //Retorna a ID do cliente cadastrado com sucesso
    public int cadastrarCliente(Clientes obj) {
        try {
            //2º passo: criar uma string de comando SQL
            String sql = "insert into tb_clientes(nome, email, cpf, telefone)"
                    + "values (?,?,?,?)";

            //3º passo: preparar o comando SQL para o driver
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, obj.getNome());
            comando.setString(2, obj.getEmail());
            comando.setString(3, obj.getCpf());
            comando.setString(4, obj.getTelefone());

            //4º passo: executar o comando sql e fechar a conexão
            comando.execute();
            comando.close();

            //Retornar a id do cliente que acabou de ser cadastrado
            sql = "select id from tb_clientes where cpf=?"; //Semelhante ao 2º passo
            comando = conexao.prepareStatement(sql); //Igual ao 3º passo
            comando.setString(1,obj.getCpf());
            
            ResultSet rs = comando.executeQuery(); //Semelhante ao 4ºpasso
            comando.close();
            
            //Percorrer todos os clientes que possuem o CPF comparado, mesmo
            //que hajam duplicatas utilizando um mesmo valor para CPF ele irá
            //setar o ID do último encontrado no conjunto de resultados
            while(rs.next()){
               obj.setId(rs.getInt("id")); 
            }
            
            //Se chegar aqui o cadastro foi efetuado com sucesso
            JOptionPane.showMessageDialog(null, "Cliente número "+
                    obj.getId()+" cadastrado com sucesso!");
            
            return obj.getId();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return -1;
        }
    }
}
