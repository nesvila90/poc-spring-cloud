package com.indra.refis.poc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BbvaRefisGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbvaRefisGatewayApplication.class, args);
    }
}
