/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_02_02;

/**
 *
 * @author trainer
 */
public class DeclencheurImpl implements Declencheur{

    @Override
    public void declenche(String msg) {
       System.out.println("Message "+msg);
    }
    
}
