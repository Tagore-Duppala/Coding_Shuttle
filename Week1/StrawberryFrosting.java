package com.codingshuttle.week1.Introductiontospring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor2", havingValue = "StrawberryFrost")   // It is same implementation as shown in ChocolateFrosting, Please refer that for more comments
public class StrawberryFrosting implements Frosting {

    @Override
    public void getFrostingType(){
        System.out.println("Yummy Strawberry Frosting!!!");
    }

}
