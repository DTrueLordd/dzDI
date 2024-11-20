package org.example.dzdi;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope("prototype")
@Qualifier("electric")
public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine started");
    }

    public ElectricEngine() {
        System.out.println("Electric Engine created");
    }
}
