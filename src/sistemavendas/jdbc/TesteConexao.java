/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemavendas.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Drews Montibeller at ldmontibeller@gmail.com
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            ConnectionFactory.getConnection();
            JOptionPane.showMessageDialog(null, "Conexão criada com sucesso.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
