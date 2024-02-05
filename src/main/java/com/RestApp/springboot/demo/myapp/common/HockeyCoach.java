package com.RestApp.springboot.demo.myapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Lazy
@Component
public class HockeyCoach implements Coach{
    public HockeyCoach(){
        System.out.println("constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "practice 4hrs daily";
    }
}
