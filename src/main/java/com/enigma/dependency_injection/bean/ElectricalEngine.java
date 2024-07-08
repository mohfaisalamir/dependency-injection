package com.enigma.dependency_injection.bean;

import org.springframework.stereotype.Component;

@Component
public class ElectricalEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Sssst");
    }
}
