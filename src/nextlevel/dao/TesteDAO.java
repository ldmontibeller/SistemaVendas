/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nextlevel.dao;

import nextlevel.model.Clientes;
import nextlevel.model.Enderecos;

/**
 *
 * @author Leonardo Drews Montibeller at ldmontibeller@gmail.com
 */
public class TesteDAO {
       public static void main(String[] args) {
//         TESTE DO CADASTRAR ENDERECOS
//        Enderecos enderecoTeste = new Enderecos();
//        
//        enderecoTeste.setCep("88888-88");
//        enderecoTeste.setRua("RUA GRANDE");
//        enderecoTeste.setNumero(888);
//        enderecoTeste.setComplemento("D");
//        enderecoTeste.setBairro("CENTRO");
//        enderecoTeste.setCidade("CHAPECO");
//        enderecoTeste.setUF("SC");
//        
//        EnderecosDAO dao = new EnderecosDAO();
//        dao.cadastrarEndereco(enderecoTeste);

//        TESTE DO LISTAR ENDERECOS
//        EnderecosDAO dao = new EnderecosDAO();
//        dao.listarEnderecos();

//        TESTE DE CADASTRAR CLIENTES E RETORNAR SEU ID
          Clientes c = new Clientes();
          c.setNome("Jose");
          c.setCpf("555.555.555-55");
          c.setEmail("email@email.com");
          c.setTelefone("(55) 5 5555-5555");
          
          ClientesDAO dao = new ClientesDAO();
          System.out.println(dao.cadastrarCliente(c));
          
    }
}
