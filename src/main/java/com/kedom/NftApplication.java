package com.kedom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NftApplication {

    public static void main(String[] args) {
        SpringApplication.run(NftApplication.class, args);
    }

}
