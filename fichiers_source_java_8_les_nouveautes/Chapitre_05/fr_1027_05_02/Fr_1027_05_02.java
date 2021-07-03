/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_05_02;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.util.Set;

/**
 *
 * @author trainer
 */
public class Fr_1027_05_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Set<Chronology> chronos = Chronology.getAvailableChronologies();
       for( Chronology c  : chronos) {
           ChronoLocalDate dt = c.dateNow();
           System.out.println("id "+c.getId()+" date "+dt.toString());
       }
       
       JapaneseDate jd = JapaneseDate.now();
       System.out.println("jd "+jd);
    }
    
}
