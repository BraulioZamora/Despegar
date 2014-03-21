package com.despegar.hf.echo.config;

import org.springframework.context.annotation.Bean;

import com.despegar.hf.echo.service.EchoService;

public class EchoConfig {

    @Bean
    public EchoService echoService() {
        return new EchoService();
    }
}
