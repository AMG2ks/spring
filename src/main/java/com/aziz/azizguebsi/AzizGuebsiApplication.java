package com.aziz.azizguebsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AzizGuebsiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzizGuebsiApplication.class, args);
    }

}
