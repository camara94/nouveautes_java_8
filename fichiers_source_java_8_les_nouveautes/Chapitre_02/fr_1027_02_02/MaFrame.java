/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_02_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author trainer
 */
public class MaFrame extends JFrame{
    
    public MaFrame() {
        
        JButton button = new JButton("Clique moi !");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("J'ai été cliqué");
            }
            
        });
        
        button.addActionListener( e ->  System.out.println("J'ai été cliqué") );
        
        pack();
    }
}
