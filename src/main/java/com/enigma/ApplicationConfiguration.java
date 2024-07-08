package com.enigma;

import com.enigma.dependency_injection.bean.Car;
import com.enigma.dependency_injection.bean.ElectricalEngine;
import com.enigma.dependency_injection.bean.GasolineEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import({EngineConfiguration.class,CarConfiguration.class})
public class ApplicationConfiguration {
}
