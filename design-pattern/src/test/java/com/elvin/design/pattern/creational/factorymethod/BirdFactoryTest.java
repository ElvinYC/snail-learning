package com.elvin.design.pattern.creational.factorymethod;

import com.elvin.design.DesignPatternApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BirdFactoryTest extends DesignPatternApplicationTests {

    @Autowired
    private WoodcookFactory woodcookFactory;

    @Test
    public void getBird() {
        BirdFactory birdFactory = woodcookFactory;
        final Bird bird = birdFactory.getBird();
        bird.fly();

    }
}
