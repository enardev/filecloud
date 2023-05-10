/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.elenaldo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.elenaldo")
@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class })
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);    
    }
}