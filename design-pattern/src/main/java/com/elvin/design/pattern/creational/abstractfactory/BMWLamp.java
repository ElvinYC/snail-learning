package com.elvin.design.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BMWLamp extends Lamp {
    @Override
    public void produce() {
        log.info("produce a BMW Lamp...");
    }
}
