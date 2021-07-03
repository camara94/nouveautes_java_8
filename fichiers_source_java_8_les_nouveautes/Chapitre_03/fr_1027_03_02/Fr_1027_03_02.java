/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_03_02;

import java.util.stream.Stream;

/**
 *
 * @author trainer
 */
public class Fr_1027_03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Stream<Personne> s= Stream.of(new Personne(34), new Personne(67), new Personne(4))
                .sorted((p1,p2) -> {return p1.compareA(p2);});
       
       s.forEach(p -> System.out.println("Personne "+p.age));
       
      // s.forEach(System.out::println); Erreur d'appliquer une deuxième fois une opération terminale
    }
    
}
