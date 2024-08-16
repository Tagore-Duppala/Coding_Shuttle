package com.codingshuttle.week1.Introductiontospring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor1", havingValue = "ChocolateSyrup")
public class ChocolateSyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("Yummy Chocolate Syrup!!!");
    }
}
