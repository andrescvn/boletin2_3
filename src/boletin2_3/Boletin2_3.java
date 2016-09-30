/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    float cambio;
    float euros; 
    cambio=Float.parseFloat(JOptionPane.showInputDialog("cambio"));
    euros =Float.parseFloat(JOptionPane.showInputDialog("euros"));
    
    
    float dolares;
    
    dolares= cambio * euros;
    
    JOptionPane.showMessageDialog(null, "dolares = " + dolares);
    
    }
   
    
}
