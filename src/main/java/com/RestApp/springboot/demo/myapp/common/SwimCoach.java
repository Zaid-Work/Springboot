package com.RestApp.springboot.demo.myapp.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Swim 1000m as a warmup";
    }
}
