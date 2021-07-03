/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_01_02;

import java.util.Comparator;

/**
 *
 * @author trainer
 */
public class ComparateurDePersonne implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       Personne p1 = (Personne)o1;
       Personne p2 = (Personne)o2;
       return p1.compareA(p2);
    }
    
}
