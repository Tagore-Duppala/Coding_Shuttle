package com.codingshuttle.week1.Introductiontospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import week1.Frosting;
//import week1.Syrup;

@Component
public class CakeBaker {

    @Autowired
    Frosting Frost;

    @Autowired
    Syrup sy;

     public void bakeCake() {
        sy.getSyrupType();
        Frost.getFrostingType();
    }
}
