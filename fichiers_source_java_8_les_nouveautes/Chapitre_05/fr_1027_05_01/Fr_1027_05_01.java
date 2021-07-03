/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_05_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author trainer
 */
public class Fr_1027_05_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //1 2 classes Date ?
        //2 ces classes ne contenaient pas la même info
        //3 cohérence dans la classe Date ... DateFormat ?
        //4 non thread safe
        //5 gestion des zones ?
        
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
        
        LocalTime dtt = LocalTime.now();
        System.out.println(dtt);
        
        LocalDateTime ddtt = LocalDateTime.now();
        System.out.println(ddtt);
        
        LocalTime zdt = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(zdt);   
        
        ZonedDateTime  zdtt = ZonedDateTime.of(ddtt, ZoneId.of("Asia/Tokyo"));
        System.out.println(zdtt);   
        
    }
    
}
