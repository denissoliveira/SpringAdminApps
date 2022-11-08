package com.example.estudo.admin.client.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientResource {
    
    private static final Logger log = LoggerFactory.getLogger(ClientResource.class);
    
    @GetMapping("ola")
    public String olaMundo() {
        return "Olá Mundo !!!";
    }

}
