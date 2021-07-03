/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_01_02;

import java.util.Arrays;

/**
 *
 * @author trainer
 */
public class Fr_1027_01_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Personne moi = new Personne(47);
        Personne elle = new Personne(46);
        
        Personne[] lesGens = new Personne[2];
        
        lesGens[0] = moi;
        lesGens[1] = elle;
        
        Arrays.sort(lesGens, Personne::compareA);
        
        for(Personne p : lesGens) {
            System.out.println(p.getAge());
        }       
    }
    
}
