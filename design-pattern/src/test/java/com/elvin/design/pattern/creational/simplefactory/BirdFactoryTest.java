package com.elvin.design.pattern.creational.simplefactory;

import com.elvin.design.DesignPatternApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class BirdFactoryTest extends DesignPatternApplicationTests {

    @Test
    public void getBird() {
        BirdFactory birdFactory = new BirdFactory();
        final Bird bird = birdFactory.getBird(Falcon.class);
        bird.fly();
    }
}