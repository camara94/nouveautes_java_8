/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_04_04;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author trainer
 */
public class Fr_1027_04_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Consumer consommateur = System.out::println;
        
        //consommateur.accept("Fabien");
        //consommateur.accept("Xavier");
        
        Stream.of("Fabien", "Xavier","Dimitri").forEach(consommateur);
        
        Stream.of(new Personne("Fabien", 45), new Personne("Xavier",67))
                .forEach(p -> affichePersonne( () -> p.age ));
    }
    
    public static void affichePersonne(Supplier s) {
        System.out.println(s.get());
    }
}
