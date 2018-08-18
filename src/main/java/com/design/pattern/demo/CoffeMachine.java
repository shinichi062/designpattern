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
@Coffee
public class CoffeMachine implements DrinkMachine{

    @Override
    public String makeDrink() {
        Coffee annoCoffee = this.getClass().getAnnotation(Coffee.class);
        System.out.println("lam cafe " + annoCoffee.type().name());
        return "coffe";
    }
    
}
