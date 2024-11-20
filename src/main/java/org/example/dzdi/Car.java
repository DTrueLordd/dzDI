package org.example.dzdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Car {

    //@Autowired
    //Field DI
    private Engine engine;


    //@Autowired
    //Constructor DI
   /* public Car(Engine engine) {
        this.engine = engine;


        System.out.println("Car is created");

        engine.start();
    }
*/


    public Car() {


        System.out.println("Car is created via default constructor");

        //engine.start();
    }


    public Engine getEngine() {
        return engine;
    }


    @Autowired
    @Qualifier("diesel")
    public void setEngine(Engine engine) {
        this.engine = engine;
        engine.start();
    }
}
