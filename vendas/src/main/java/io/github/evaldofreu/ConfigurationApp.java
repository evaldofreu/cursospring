package io.github.evaldofreu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {
       @Bean("applicationName")
      public String applicationName(){
        return "Sistema de Vendas";
      }
}