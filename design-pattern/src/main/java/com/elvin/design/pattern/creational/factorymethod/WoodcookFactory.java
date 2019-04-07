package com.elvin.design.pattern.creational.factorymethod;

public class WoodcookFactory extends BirdFactory {
    @Override
    public Bird getBird() {
        return new Woodcook();
    }
}
