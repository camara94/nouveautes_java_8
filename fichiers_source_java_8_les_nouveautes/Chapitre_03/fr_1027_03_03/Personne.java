/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_03_03;

/**
 *
 * @author trainer
 */
public class Personne {
    private int age;
    private String nom;
    
    public Personne( String nom, int age) { this.nom=nom; this.age=age;}
    public int getAge() { return age;}
    public String getNom() { return nom;}
    
    @Override
    public String toString() {
        return nom+" : "+age;
    }
}
