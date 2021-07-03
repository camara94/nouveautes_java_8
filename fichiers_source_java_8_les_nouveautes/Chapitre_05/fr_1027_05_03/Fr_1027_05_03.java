/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_05_03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 *
 * @author trainer
 */
public class Fr_1027_05_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        
        System.out.println("Date : "+dt);
        System.out.println(dt.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(dt.format(DateTimeFormatter.BASIC_ISO_DATE));
        
        LocalDate dtt = LocalDate.parse("2015-09-01");
        System.out.println(dtt);
        
        LocalDate dtt2 = LocalDate.parse("3::août::2015",DateTimeFormatter.ofPattern("d::MMM::uuuu"));
        System.out.println(dtt2);
        
    }
    
}
