package com.elvin.design.pattern.creational.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class BMWFactory implements VehicleFactory{
    @Override
    public Wheel getWheel() {
        return new BMWWheel();
    }

    @Override
    public Lamp getLamp() {
        return new BMWLamp();
    }
}
