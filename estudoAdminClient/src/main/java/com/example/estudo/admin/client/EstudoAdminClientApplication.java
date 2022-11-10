package com.example.estudo.admin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EstudoAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudoAdminClientApplication.class, args);
    }

    // Cria um link http://localhost:8081/actuator/custom, vai ser usado no link customizado com vue.js
    @Bean
    public CustomEndpoint customEndpoint() {
        return new CustomEndpoint();
    }

    @Endpoint(id = "custom")
    public class CustomEndpoint {

        @ReadOperation
        public String getHello() {
            return "Olá Mundo !!!!";
        }

    }


}
