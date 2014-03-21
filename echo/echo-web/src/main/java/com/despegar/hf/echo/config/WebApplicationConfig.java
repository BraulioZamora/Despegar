package com.despegar.hf.echo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.despegar.hf.echo.controller.EchoController;

@Configuration
@EnableWebMvc
@ImportResource({
    "classpath:com/despegar/library/properties/base-properties-context.xml",
    "classpath:com/despegar/library/version/version-controller.xml",
    "classpath:com/despegar/library/healthcheck/health-check-controller.xml",
    "classpath:com/despegar/library/api/api-context.xml",
    "classpath:com/despegar/library/documentation/application-context.xml"})
@Import(EchoConfig.class)
public class WebApplicationConfig extends WebMvcConfigurerAdapter {
    
    private @Autowired
    EchoConfig echoConfig;

    @Bean
    public EchoController echoController() {
        EchoController echoController = new EchoController();
        echoController.setEchoService(echoConfig.echoService());
        return echoController;
    }

}
