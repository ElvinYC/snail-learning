package com.elvin.design.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BenzWheel extends Wheel{
    @Override
    public void produce() {
        log.info("produce a Benz Wheel...");
    }
}
