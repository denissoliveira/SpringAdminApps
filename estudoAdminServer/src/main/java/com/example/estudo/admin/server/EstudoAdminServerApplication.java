package com.example.estudo.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
public class EstudoAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudoAdminServerApplication.class, args);
    }

}
