/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_03_02;

/**
 *
 * @author trainer
 */
public class Personne {
    int age;
    public Personne(int age) { this.age=age;}
    
    public int compareA(Personne p) {
        return age-p.age;
    }
    
    @Override
    public String toString() {
        return "Age : "+age;
    }
}
