/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_01_04;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author trainer
 */
public class Fr_1027_01_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String> maListe = new ArrayList<>();
        
        List<Object> emptyList = Collections.emptyList();
        maListe = Collections.emptyList();
        
        Method[] lesMethodes = Personne.class.getDeclaredMethods();
        
        for(Method m : lesMethodes) {
            System.out.println("Méthode : "+m.getName());
            Parameter[] parameters = m.getParameters();
            for(Parameter p : parameters) {
                System.out.println(" type du paramètre "+p.getType());
                System.out.println(" nom du paramètre "+p.getName());
            }
        }
        
    }
    
}
