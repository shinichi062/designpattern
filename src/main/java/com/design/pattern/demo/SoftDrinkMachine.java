/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.demo;

import org.springframework.stereotype.Service;

/**
 *
 * @author OS
 */
@Service
@SoftDrink
public class SoftDrinkMachine implements DrinkMachine{

    @Override
    public String makeDrink() {
        SoftDrink annoCoffee = this.getClass().getAnnotation(SoftDrink.class);
        System.out.println("lam nuoc ep " + annoCoffee.type().name());
        return "sotfdrink";
    }
    
}
