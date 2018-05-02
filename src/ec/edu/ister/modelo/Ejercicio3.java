/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Ejercicio3 {
    public static void main(String[] args) {
             int personas;
        double nA, nB, nC, nD;
        double porA, porB, porC, porD;
        
       personas = Integer.parseInt ( JOptionPane.showInputDialog ( " INGRESE LA CANTIDAD TOTAL DE PERSONAS: " ));
       
       
       nA = personas * 0.30 ;
       nB = nA * 0.40 ;
       nC = (nA + nB) * 0.25 ;
       nD = personas - (nA + nB + nC);
       
       
       porA = nA / personas *  100 ;
       porB = nB / personas *  100 ;
       porC = nC / personas *  100 ;
       porD =  100 - (porA + porB + porC);
       
       
       JOptionPane.showMessageDialog ( null , " Categorias " );
       JOptionPane.showMessageDialog ( null , " A: "  + porA+ " % "  );
       JOptionPane.showMessageDialog ( null , " B: "  + porB+ " % "  );
       JOptionPane.showMessageDialog ( null , " C:"  + porC+ " % " );
       JOptionPane.showMessageDialog ( null , " D:"  + porD + " % " );
    }  
}
   

