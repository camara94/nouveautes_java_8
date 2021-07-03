/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_04_01;

/**
 *
 * @author trainer
 */
public class Fr_1027_04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Traitement t1 = (Ressource r) -> r.getStatus();
        Traitement t2 = (Ressource r) -> r.getStatus() ? false : true;
         
        lanceTraitements(new Ressource(),t1);
    }
    
    public static void lanceTraitements(Ressource r, Traitement t) {
        
        if(t.traite(r)) {
            System.out.println("Traitement achevé");
        }
        else {
            System.out.println("Traitement en cours");
        }
    }
}
