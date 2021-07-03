/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_04_03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author trainer
 */
public class Fr_1027_04_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Function<Integer, Double> celsiusVersFahrenheit = x -> new Double(x*9/5+32);
       
       System.out.println(celsiusVersFahrenheit.apply(0));
       
       Function<List<Integer>, Integer> somme = liste -> {
         int total = 0;
         
         for(Integer i : liste) {
             total+=i;
         }
         return total;
       };
       
      Integer valeur =  somme.apply(Arrays.asList(3,4,5,6,7));
       System.out.println("Valeur "+valeur);
       
    }
    
}
