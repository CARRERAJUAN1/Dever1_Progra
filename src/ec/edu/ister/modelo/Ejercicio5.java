/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Ejercicio5 {
   private int baseMenor,baseMayor, altura;
       
     public void  públicaTrapecio () {
      Scanner entrada = new Scanner( System.in);
        
         JOptionPane.showInputDialog( " Ingresar valor de base menor: " );
        baseMenor = entrada . nextInt ();
       JOptionPane.showInputDialog( " Ingresar valor de base mayor: " );
        baseMayor = entrada . nextInt ();
        JOptionPane.showInputDialog( " Ingresar valor de la altura: " );
        altura = entrada . nextInt ();
       JOptionPane.showMessageDialog(null," El área del trapecio es: "  + (altura * ((baseMenor + baseMayor) /  2 )));
    }
    
}
