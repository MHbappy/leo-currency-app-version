package com.currency.configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppVersionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppVersionServerApplication.class, args);
    }

}
