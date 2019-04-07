package com.elvin.design.pattern.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Woodcook extends Bird {
    @Override
    public void fly() {
        log.info("Woodcook fly slow...");
    }
}
