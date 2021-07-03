/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_04_02;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author trainer
 */
public class Fr_1027_04_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Predicate<Ressource> ressourceDispo = (Ressource r) -> r.estDisponible();
        
        Stream.of(new Ressource(true), new Ressource(false), new Ressource(true))
                .filter(ressourceDispo)
                .forEach(System.out::println);
                
    }
    
}
