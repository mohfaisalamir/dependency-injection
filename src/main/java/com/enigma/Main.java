package com.enigma;
// Belajar Dependency Injection
public class Main {
    public static void main(String[] args) {
        Engine engine = new Elect();
        Engine engine2 = new Gas();

        // Constructor Injection
        Car car = new Car(
                "Civic",
                "Honda",
                engine
        );
        car.start();
        //setter Injection
        car.setEngine(engine2);
        car.start();
    }
}