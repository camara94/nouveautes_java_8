/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_01_02;

/**
 *
 * @author trainer
 */
public class Personne {
    private int age;
    
    public int getAge() { return age;}
    
    public Personne(int age) { this.age=age;}
    
   /* static public int compareA(Personne g, Personne d) {
        return g.age-d.age;
    }*/
    public int compareA( Personne d) {
        return this.age-d.age;
    }
}
