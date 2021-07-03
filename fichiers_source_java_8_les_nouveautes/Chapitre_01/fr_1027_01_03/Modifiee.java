/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_1027_01_03;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 *
 * @author trainer
 */
@Repeatable(Modifiees.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Modifiee {
    String auteur() default "inconnu";
}
