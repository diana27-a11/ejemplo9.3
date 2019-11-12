/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo9.pkg3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class Ejemplo93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PilaVector pila = new PilaVector();
        int x;
        BufferedReader entrada = new BufferedReader 
        (new InputStreamReader(System.in));
        System.err.println("Teclea el numero de Elemenos: ");
        try {
            x = Integer.parseInt(entrada.readLine());
            for (int i = 0; i < x; i++) {
                Double d;
                d = Double.valueOf(entrada.readLine());
                pila.insertar(d);

            }
            System.err.println("Elementos de la pila: ");
            while (!pila.pilaVacia()) {

                Double d;
                d = (Double) pila.quitar();
                if (d.doubleValue() > 0.0) {
                    System.err.println(d + "");
                }
            }

        }
        catch (Exception er) {
            System.err.println("Exception: " + er);
            
        }
        
    }
}
