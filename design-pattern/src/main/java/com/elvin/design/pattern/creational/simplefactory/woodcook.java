package com.elvin.design.pattern.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class woodcook extends Bird {
    @Override
    public void fly() {
        log.info("woodcook fly slow...");
    }
}
