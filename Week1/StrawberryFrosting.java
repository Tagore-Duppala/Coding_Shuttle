package com.codingshuttle.week1.Introductiontospring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor2", havingValue = "StrawberryFrost")
public class StrawberryFrosting implements Frosting {

    @Override
    public void getFrostingType(){
        System.out.println("Yummy Strawberry Frosting!!!");
    }

}
