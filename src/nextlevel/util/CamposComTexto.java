/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nextlevel.util;

import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Leonardo Drews Montibeller at ldmontibeller@gmail.com
 */
public class CamposComTexto {

    public static void limpar(JPanel painel) {
        Component components[] = painel.getComponents();
        for (Component componente : components) {
            if (componente instanceof JTextField) {
                ((JTextField)componente).setText(null);
            }
            if (componente instanceof JFormattedTextField){
                ((JFormattedTextField)componente).setText(null);
            }
        }
    }
}
