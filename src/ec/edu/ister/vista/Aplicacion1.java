/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Aplicacion1 {
    public static void main(String[] args) {
               Ejercicio1 c1;
        float lado1, lado2;
       lado1 = Float.parseFloat( JOptionPane.showInputDialog ( " Digite lado1: " ));
       lado2 = Float.parseFloat( JOptionPane.showInputDialog ( " Digite lado2: " ));
       if (lado1 == lado2) {
           c1 =new Ejercicio1(lado1);
       }else{
           c1 = new Ejercicio1 (lado1, lado2);
       }
    JOptionPane.showMessageDialog(null," El  perimetro  es :"+c1.getPerimetro());
    JOptionPane.showMessageDialog(null," El  área  es :" + c1.getArea());
}
  
}

