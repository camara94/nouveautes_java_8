/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_03_04;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author trainer
 */
public class Fr_1027_03_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ForkJoinPool pool = ForkJoinPool.commonPool();
        System.out.println(pool.getParallelism());
        
        Arrays.asList("fabien","xavier","dimitri","sylvain","florent","toto","titi","tata","oups")
                .parallelStream()
                .forEach(s -> System.out.println(s+" : "+Thread.currentThread().getName()));
        
        
    }
    
}
