package com.indra.bbva.refis.poc.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BbvaRefisConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbvaRefisConfigServerApplication.class, args);
    }
}
