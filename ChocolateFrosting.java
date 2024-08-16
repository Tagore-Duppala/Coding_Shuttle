package com.codingshuttle.week1.Introductiontospring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor1", havingValue = "ChocolateFrost")
//@Primary
public class ChocolateFrosting implements Frosting {

    @Override
    public void getFrostingType() {
        System.out.println("Yummy Chocolate Frosting!!!");
    }
}
