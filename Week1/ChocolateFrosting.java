package com.codingshuttle.week1.Introductiontospring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor1", havingValue = "ChocolateFrost")
//@Primary                                 // We need to declare primary annotation if there is no condition and if single interface is implemented by multiple classes
                                           // When we inject a bean into some class and if the implemented method from interface was called then it creates confusion and throws an error stating method present in multiple beans
                                           // To avoid this we mark one class as primary, If we wanted to make it dynamic then, We put the ConditiononProperty and we set the condtions in app.configuration
                                            // Note there are several other annotations as well ->  ClassOnPrperty etc
public class ChocolateFrosting implements Frosting {

    @Override
    public void getFrostingType() {
        System.out.println("Yummy Chocolate Frosting!!!");
    }
}
