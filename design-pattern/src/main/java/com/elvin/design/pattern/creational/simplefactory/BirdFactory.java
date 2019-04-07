package com.elvin.design.pattern.creational.simplefactory;

import org.springframework.stereotype.Component;

@Component
public class BirdFactory {

    public Bird getBird(Class c) {
        Bird bird = null;
        try {
            bird = (Bird) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bird;
    }

}
