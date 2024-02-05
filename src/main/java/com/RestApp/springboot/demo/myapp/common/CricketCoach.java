package com.RestApp.springboot.demo.myapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationPropertiesBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component -> used to create a bean or a class which finally overrides the
// interface because it is required
@Component
// both constructors called when bean initialized
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("constructor " + getClass().getSimpleName());
    }
    //define init method -> before bean creation
//    @PostConstruct
//    public void doMyStuff(){
//        System.out.println("do my startup stuff");
//    }
//    @PreDestroy
//    public void doMyCleanStuff(){
//        System.out.println("do my clean stuff");
//    }
    @Override
    public String getDailyWorkout(){
        return "run 2 hrs daily!!!!";
    }
}
