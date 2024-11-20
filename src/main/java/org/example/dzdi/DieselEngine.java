package org.example.dzdi;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("diesel")
public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine started");
    }

    public DieselEngine() {
        System.out.println("Diesel Engine created");
    }
}
