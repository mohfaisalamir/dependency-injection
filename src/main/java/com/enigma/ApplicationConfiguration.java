package com.enigma;

import com.enigma.dependency_injection.bean.Car;
import com.enigma.dependency_injection.bean.ElectricalEngine;
import com.enigma.dependency_injection.bean.Engine;
import com.enigma.dependency_injection.bean.GasolineEngine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.enigma.dependency_injection")
//@Import({EngineConfiguration.class,CarConfiguration.class})
public class ApplicationConfiguration {

    @Bean(name = "tesla")
    public Car car(@Qualifier("electricalEngine")Engine engine) {
        return new Car(engine);
    }
}
