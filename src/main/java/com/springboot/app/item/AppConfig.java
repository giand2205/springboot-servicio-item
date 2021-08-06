package com.springboot.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("clienteRest")
    @LoadBalanced //con está anotación utiliza Ribbon para balanceo de carga
    RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }

}
