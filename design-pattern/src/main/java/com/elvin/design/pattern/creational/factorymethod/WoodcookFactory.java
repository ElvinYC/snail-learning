package com.elvin.design.pattern.creational.factorymethod;

import org.springframework.stereotype.Component;

@Component
public class WoodcookFactory extends BirdFactory {
    @Override
    public Bird getBird() {
        return new Woodcook();
    }
}
