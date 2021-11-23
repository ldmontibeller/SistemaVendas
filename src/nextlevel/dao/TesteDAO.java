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
//      TESTE DO CADASTRAR CLIENTE
        Clientes clienteTeste = new Clientes();
        clienteTeste.setCpf("123.456.789-50 ");
        clienteTeste.setEmail("email@email.com");
        clienteTeste.setTelefone("(49) 9 9999-9999");
        
        System.out.println(clienteTeste.getId());
        
        ClientesDAO dao = new ClientesDAO();
        dao.cadastrarCliente(clienteTeste);
        
        System.out.println(clienteTeste.getId());
        
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

//        TESTE DO LISTAR ENDERECO
//          EnderecosDAO dao = new EnderecosDAO();
//          dao.listarEnderecos();         
    }
}
