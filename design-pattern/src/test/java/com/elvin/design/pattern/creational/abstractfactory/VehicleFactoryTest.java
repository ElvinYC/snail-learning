package com.elvin.design.pattern.creational.abstractfactory;

import com.elvin.design.DesignPatternApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class VehicleFactoryTest extends DesignPatternApplicationTests {

    @Autowired
    private BenzFactory benzFactory;

    @Autowired
    private BMWFactory bmwFactory;

    @Test
    public void test() {
        VehicleFactory vehicleFactory = benzFactory;
        Lamp lamp = vehicleFactory.getLamp();
        Wheel wheel = vehicleFactory.getWheel();
        lamp.produce();
        wheel.produce();

        vehicleFactory = bmwFactory;
        lamp = vehicleFactory.getLamp();
        wheel = vehicleFactory.getWheel();
        lamp.produce();
        wheel.produce();
    }

}