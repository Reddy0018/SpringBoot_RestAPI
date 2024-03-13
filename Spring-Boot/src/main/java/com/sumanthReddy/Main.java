package com.sumanthReddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Sumanth Reddy");
        SpringApplication.run(Main.class,args);
    }

//    @GetMapping("/")
    public greeting greet(){
        return new greeting("Hi Welcome");
    }

    record greeting(String greet){}
}
