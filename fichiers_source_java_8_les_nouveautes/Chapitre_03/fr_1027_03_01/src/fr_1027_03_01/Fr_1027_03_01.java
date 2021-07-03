/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_03_01;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author trainer
 */
public class Fr_1027_03_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String> maListe = new ArrayList<>();
        
        maListe.add("Fabien");
        maListe.add("Xavier");
        maListe.add("Dimitri");
        
        maListe.stream()
                .filter( s -> s.startsWith("X"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        
        IntStream.range(1,10).forEach(System.out::println);
        
        Stream.of("Fabien","Xavier","Dimitri").forEach(System.out::println);
        Object[] toArray = Stream.of("Fabien","Xavier","Dimitri").toArray();
        
        
        
        
        
    }
    
}
