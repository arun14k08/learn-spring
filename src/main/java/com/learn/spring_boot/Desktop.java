package com.learn.spring_boot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {

    public void compute() {
        System.out.println("From Desktop");
    }
}
