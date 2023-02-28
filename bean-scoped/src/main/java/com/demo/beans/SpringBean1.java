package com.demo.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    private static int count=0;
    public SpringBean1(){
        System.out.println("SpringBean1 constructor.");
        count++;
    }

    public static int getCount() {
        return count;
    }
}
