package com.elvin.design.pattern.creational.factorymethod;

import com.elvin.design.DesignPatternApplicationTests;
import org.junit.Test;

public class BirdFactoryTest extends DesignPatternApplicationTests {

    @Test
    public void getBird() {
        BirdFactory birdFactory = new WoodcookFactory();
        final Bird bird = birdFactory.getBird();
        bird.fly();

    }
}
