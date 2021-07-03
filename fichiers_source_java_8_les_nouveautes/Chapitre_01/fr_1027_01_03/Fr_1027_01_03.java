/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_01_03;

import java.lang.annotation.Annotation;

/**
 *
 * @author trainer
 */
public class Fr_1027_01_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Annotation[] annotations = Personne.class.getAnnotations();
        for( Annotation a : annotations) {
           System.out.println(a);
        }
    }
    
}
