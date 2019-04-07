package com.elvin.design.pattern.creational.simplefactory;

import com.elvin.design.DesignPatternApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


@Slf4j
public class BirdFactoryTest extends DesignPatternApplicationTests {

    @Autowired
    BirdFactory birdFactory;

    @Test
    public void getBird() {
        final Bird bird = birdFactory.getBird(Falcon.class);
        bird.fly();
    }
}