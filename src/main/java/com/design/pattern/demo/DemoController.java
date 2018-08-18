/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author OS
 */
@Controller
public class DemoController {
    
    @Autowired
    @Coffee
    DrinkMachine coffee;
    
    @Autowired
    @SoftDrink
    DrinkMachine softDrink;
    
    @RequestMapping("/get-coffe")
    @ResponseBody
    public String getCoffe(){
       return coffee.makeDrink();
    }
    @RequestMapping("/get-softdrink")
    @ResponseBody
    public String getSoftDrink(){
        return softDrink.makeDrink();
    }
}
