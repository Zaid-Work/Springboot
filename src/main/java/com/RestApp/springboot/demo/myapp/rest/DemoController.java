package com.RestApp.springboot.demo.myapp.rest;

import com.RestApp.springboot.demo.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    @Qualifier("cricketCoach")
//    @Autowired
private Coach myCoach;
    private Coach yourCoach;
    public DemoController(){
        System.out.println("constructor " + getClass().getSimpleName());
    }
//    @Autowired -> not necessary to use in constructor injection
    @Autowired
//    @Qualifier -> more specific

    public void setCoach(@Qualifier ("aquatic")
                             Coach theCoach, @Qualifier("cricketCoach") Coach theYourCoach){
        System.out.println("setter injection");
        myCoach = theCoach;
        yourCoach = theYourCoach;
    }
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/check")
    public String check(){
        return "comparing myCoach and yourCoach " + (myCoach == yourCoach);
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
//DemoController demo = new DemoController(new Coach()) -> constructor injection
// demo.getDailyWorkout -> at /dailyworkout get req


