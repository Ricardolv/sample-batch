package com.richard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SampleBatchApplication {

    public static void main(String[] args) {
//	System.exit(SpringApplication.exit(SpringApplication.run(SampleBatchApplication.class, args)));
        SpringApplication.run(SampleBatchApplication.class, args);
    }

}
