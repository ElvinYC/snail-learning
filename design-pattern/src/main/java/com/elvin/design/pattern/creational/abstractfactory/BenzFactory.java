package com.elvin.design.pattern.creational.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class BenzFactory implements VehicleFactory {
    @Override
    public Wheel getWheel() {
        return new BenzWheel();
    }

    @Override
    public Lamp getLamp() {
        return new BenzLamp();
    }
}
