/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;



/**
 *
 * @author PC
 */
public class Ejercicio1 {
    
     private float lado1;
     private float lado2;
 // ejercicio 1
public Ejercicio1( float  lado1 , float  lado2 ) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

public Ejercicio1( float  lado1 ) {
        this.lado1 =  this.lado2 = lado1;
    }

    public Ejercicio1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public float getPerimetro () {
        float perimetro =  2  * (lado1 + lado2);
        return perimetro;
    }
 public float getArea () {
       float àrea  = (lado1 * lado2);
       return àrea ;
    }

         
}
