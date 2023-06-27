package io.github.evaldofreu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = 
{"io.github.evaldofreu.vendas.repository.MeuRepository",
 "io.github.evaldofreu.vendas.service.MeuService"})
@RestController
public class VendasApplication {



    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args)   ;
    }

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }
    
}
