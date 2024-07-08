package com.enigma;

import com.enigma.dependency_injection.bean.Car;
import com.enigma.dependency_injection.bean.ElectricalEngine;
import com.enigma.dependency_injection.bean.Engine;
import com.enigma.dependency_injection.bean.GasolineEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Belajar Dependency Injection
public class Main {
    public static void main(String[] args) {
        // setelah membuat bean, lalu dibuat Container-nya
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("para-bean.xml");
        Engine gasolineEngine = (Engine) context.getBean("gasolineEngine");
        Engine gasolineEngine1 = (Engine) context.getBean("gasolineEngine");
        Engine gasolineEngine2 = (Engine) context.getBean("gasolineEngine");

        Car tesla = (Car) context.getBean("supra");
        Car tesla2 = (Car) context.getBean("civic");
        System.out.println(tesla);
        System.out.println(tesla2);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);

        /*Engine electricalEngine = (Engine) context.getBean("electricalEngine");
        Engine allesEngine = (Engine) context.getBean("alapAlapEngine");
        allesEngine.start();
        gasolineEngine.start();
        electricalEngine.start();
        System.out.println(gasolineEngine +"\n"+electricalEngine +"\n"+allesEngine+"\n"+gasolineEngine1+"\n"+gasolineEngine2);*/
        /*Engine engine = new ElectricalEngine();
        Engine engine2 = new GasolineEngine();

        // Constructor Injection
        Car car = new Car(
                "Civic",
                "Honda",
                engine
        );
        car.start();
        //setter Injection
        car.setEngine(engine2);
        car.start();*/
    }
}