package com.sumanthReddy;

import com.sumanthReddy.Person.Person;
import com.sumanthReddy.Person.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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

    /**@Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository){
        return args -> {
            personRepository.save(new Person("Sumanth","Bekkem","sxb1454",24));
        };
    }*/
}
