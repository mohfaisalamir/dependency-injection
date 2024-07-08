package com.enigma.dependency_injection.bean;

public class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Brummm");
    }
}
