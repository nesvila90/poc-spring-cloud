package com.example.integraciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * The type Integraciones application.
 */
@EnableEurekaClient
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class IntegracionesApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(IntegracionesApplication.class, args);
    }

}
