package com.estudo.estudo.admin.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAdminClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminClient2Application.class, args);
	}
	
	// Cria um link http://localhost:8081/actuator/custom, vai ser usado no link customizado com vue.js
    @Bean
    public CustomEndpointTest customEndpointTest() {
        return new CustomEndpointTest();
    }

    @Endpoint(id = "customTest")
    public class CustomEndpointTest {

        @ReadOperation
        public String getHello() {
            return "Olá Mundo !!!!";
        }

    }

}
