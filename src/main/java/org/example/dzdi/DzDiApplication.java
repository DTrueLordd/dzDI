package org.example.dzdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DzDiApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(DzDiApplication.class, args);

        //Car car = context.getBean(Car.class);
    }

}
