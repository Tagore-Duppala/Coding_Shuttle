package com.codingshuttle.week1.Introductiontospring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component // Defining it as a Bean in Springboot
@ConditionalOnProperty(name = "Flavor1", havingValue = "ChocolateSyrup") // Setting a condition which executes the below class when satisfied.
                                                                        // Conditions can be set manually in app configiration
public class ChocolateSyrup implements Syrup {

    @Override
    public void getSyrupType() {                                        
        System.out.println("Yummy Chocolate Syrup!!!");
    }
}
