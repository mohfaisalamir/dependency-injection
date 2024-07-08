package com.enigma;

import com.enigma.dependency_injection.bean.Car;
import com.enigma.dependency_injection.bean.ElectricalEngine;
import com.enigma.dependency_injection.bean.GasolineEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;

@Configuration
public class CarConfiguration {
    @Bean(name = "a")
    @Autowired
    public Car car(GasolineEngine gasolineEngine){
        return new Car();
    }
    @Bean(name = "b")
    @Scope(scopeName = "prototype")// scope ini untyuk membuat lebih dari 1 tesla (object), tanpa ini dia hanya bisa  membuat 1 object saja.
    public Car tesla(){
        return new Car();
    }
}
