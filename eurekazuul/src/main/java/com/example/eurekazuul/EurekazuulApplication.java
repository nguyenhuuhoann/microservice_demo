package com.example.eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EurekazuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekazuulApplication.class, args);
    }

}
