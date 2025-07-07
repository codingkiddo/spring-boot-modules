package com.spring_boot_modules.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.spring_boot_modules.bootstrap")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}