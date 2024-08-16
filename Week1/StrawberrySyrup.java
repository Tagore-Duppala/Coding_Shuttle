package com.codingshuttle.week1.Introductiontospring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "Flavor2", havingValue = "StrawberrySyrup") //Same comments as ChocolateFrosting file
public class StrawberrySyrup implements Syrup {

    @Override
    public void getSyrupType(){
        System.out.println("Yummy Strawberry Syrup!!!");
    }
}
