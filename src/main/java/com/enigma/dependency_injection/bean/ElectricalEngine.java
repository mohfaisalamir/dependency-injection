package com.enigma.dependency_injection.bean;

public class ElectricalEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Sssst");
    }
}
