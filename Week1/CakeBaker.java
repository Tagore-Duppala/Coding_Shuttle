package com.codingshuttle.week1.Introductiontospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                        //Used to define as Java Bean, There are other annotations like @Service, @Repository, @Controller to define a class as a Bean, but Spring categorize them into different groups, But inturn everything is a Bean.
public class CakeBaker {

    @Autowired                    // Used for Dependency Injection, It injects the dependents, Here it is Frosting Interface which was implemented by multiple classes and those classes were declared as beans, So need not declare interface as a bean.
    Frosting Frost;

    @Autowired
    Syrup sy;

     public void bakeCake() {
        sy.getSyrupType();
        Frost.getFrostingType();
    }
}
