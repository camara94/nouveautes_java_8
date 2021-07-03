/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_02_02;

/**
 *
 * @author trainer
 */
public class Fr_1027_02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        afficheMessage(new DeclencheurImpl());
        afficheMessage( s -> System.out.println(s));
    }
    
    public static void afficheMessage(Declencheur dec){
        dec.declenche("Coucou les lambdas");
    }
}
