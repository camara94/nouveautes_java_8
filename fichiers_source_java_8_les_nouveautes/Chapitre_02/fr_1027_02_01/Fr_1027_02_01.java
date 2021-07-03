/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_02_01;

import java.util.Arrays;

/**
 *
 * @author trainer
 */
public class Fr_1027_02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Personne[] lesPersonnes = { new Personne(54), new Personne(12), new Personne(89), new Personne(23)};
    
        //1 créer une classe implémentant Comparator
        //2 référencer une méthode qui existe !!
        //3 utiliser les lambdas expressions
        
        Arrays.sort(lesPersonnes, (p1, p2)-> {return p1.getAge()-p2.getAge();});
    
        // p -> code
        
        for(Personne p :lesPersonnes) {
            System.out.println(p.getAge());
        }
    }
    
}
