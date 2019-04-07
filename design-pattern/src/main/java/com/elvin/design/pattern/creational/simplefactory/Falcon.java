package com.elvin.design.pattern.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Falcon extends Bird {

    @Override
    public void fly() {
        log.info("falcon fly fast...");
    }
}
