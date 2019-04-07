package com.elvin.design.pattern.creational.factorymethod;

public class FalconFactory extends BirdFactory {
    @Override
    public Bird getBird() {
        return new Falcon();
    }
}
