/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_03_03;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author trainer
 */
public class Fr_1027_03_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Personne> liste = new ArrayList<> ();
        
        liste.add(new Personne("fabien",47));
        liste.add(new Personne("xavier",34));
        liste.add(new Personne ("dimitri", 23));
        
        List<Personne> listeFiltree = liste.stream()
               .filter(p -> p.getAge() > 30)
               .collect(Collectors.toList());
        
        
        listeFiltree.stream().forEach(System.out::println);
        
        double ageMoyen = liste.stream().collect(Collectors.averagingInt(p->p.getAge()));
        
        System.out.println("Age moyen : "+ageMoyen);
        
        Integer ageTotal = liste.stream().reduce(0,(somme,p) -> somme+=p.getAge(), (s1,s2)->s1+s2);
        
        System.out.println("Age total "+ageTotal);
        
        
    }
    
}
