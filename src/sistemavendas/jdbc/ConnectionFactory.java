/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavendas.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Leonardo Drews Montibeller at ldmontibeller@gmail.com
 */
public class ConnectionFactory {
    
   public static  Connection getConnection(){
        try {
            Properties prop = getProperties();
            //URL para conexão com o BD
            //Comandos extras para estabelecer uma conexão segura com o BD sem checar o certificado
            final String url = prop.getProperty("db.url") + "?verifyServerCertificate=false&useSSL=true";
            final String user = prop.getProperty("db.user");
            final String password = prop.getProperty("db.password");
            
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            //Lança a exceção na tela em tempo de execução para sabermos o que aconteceu
            throw new RuntimeException(e);
        }
        
    }
   
   private static Properties getProperties() throws IOException {
       Properties prop = new Properties();
       String path = "/sistemavendas/jdbc/connection.properties";
       prop.load(ConnectionFactory.class.getResourceAsStream(path));
       return prop;
   }
        
}
