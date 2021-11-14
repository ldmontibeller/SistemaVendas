/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextlevel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leonardo Drews Montibeller at ldmontibeller@gmail.com
 */
public class ConnectionFactory {
    
   static public Connection getConnection(){
        try {
            //URL para conexão com o BD
            final String url = "jdbc:mysql://localhost:3306/NEXTLEVELBDv2"
                    //Comandos extras para estabelecer uma conexão segura com o BD
                    //Ficou curioso? Estude sobre SSL
                    + "?verifyServerCertificate=false&useSSL=true";
            final String user = "teste";
            final String password = "987654";
            
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            //Lança a exceção na tela em tempo de execução para sabermos o que aconteceu
            throw new RuntimeException(e);
        }
    }
}
