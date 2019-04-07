package com.e3yn4uk.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by 8e3Yn4uK on 06.04.2019
 */

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){

        return "Hello World! Time on server is: " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){

        return "Run a hard 5k";
    }
}
