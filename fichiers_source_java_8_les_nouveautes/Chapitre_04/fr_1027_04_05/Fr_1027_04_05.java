/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_04_05;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 *
 * @author trainer
 */
public class Fr_1027_04_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BiFunction<String, String, Integer> longueur = (String s1,String s2) -> { return s1.length()+s2.length();} ;
        
        System.out.println(longueur.apply("Fabien","Xavier"));
        
        BiPredicate<String, String> estPlusGrande = (s1,s2) -> { return s1.length()> s2.length();};
        System.out.println(estPlusGrande.test("Fabien","Brissonneau"));
    }
    
}
