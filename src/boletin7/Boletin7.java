/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro L1 = new Libro("metamorfosis","kafka",5,1);
        L1.prestamento();
        System.out.println(L1.toString());
    }
    
}
