package com.RestApp.springboot.demo.myapp.config;

import com.RestApp.springboot.demo.myapp.common.Coach;
import com.RestApp.springboot.demo.myapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
