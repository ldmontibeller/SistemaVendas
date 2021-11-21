/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nextlevel.controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import nextlevel.dao.ClientesDAO;
import nextlevel.model.Clientes;



/**
 *
 * @author Leonardo Drews Montibeller at ldmontibeller@gmail.com
 */
public class Tabelas {
    
    public static void tabelarClientes(JTable obj){
        //1º passo: criar um objeto DAO para podermos utilizar seus métodos
        ClientesDAO dao = new ClientesDAO();
        
        //2º passo: criar uma lista de endereços através do método listar 
        //enderecos do DAO
        List<Clientes> lista = dao.listarClientes();
        
        //3º passo: criar uma tabela do modelo padrão. Para isso pegamos o modelo
        //do componente jTable da tela através do método getModel() e convertemos
        //ele através de um casting para o modelo de tabela padrão.
        DefaultTableModel tabela = (DefaultTableModel)obj.getModel();
        
        //4º passo: setamos o número de colunas de nossa tabela em zero para limpar 
        // e garantir que não existem nenhum dado pré existente.
        tabela.setNumRows(0);
        
        //5º passo: precisamos colocar os itens da lista na tabela. Para cada objeto
        //do tipo Cliente na lista, nós adicionamos um novo objeto com os atributos
        //do objeto endereco nos seus campos separados por vírgula.
        for(Clientes cliente: lista){ //este é um exemplo de uso do for-each
            tabela.addRow(new Object[]{ //este Object é um vetor/array
            cliente.getId(),
            cliente.getNome(),
            cliente.getCpf(),
            cliente.getEmail(),
            cliente.getTelefone()
            } );
        }
        
    }
}
