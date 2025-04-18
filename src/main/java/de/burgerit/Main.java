package de.burgerit;

import de.burgerit.application.services.Methode1_5_Service;
import de.burgerit.domain.domain1.Methode1Entity;
import de.burgerit.domain.domain1.Methode2Entity;
import de.burgerit.legacy.myclass.MyClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Start Main");
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext("de.burgerit");

        log.info("New calls from Spring");

        var methode15Service = annotationConfigApplicationContext.getBean(Methode1_5_Service.class);

        methode15Service.methode1(new Methode1Entity("ConfigSet"));
        var result = methode15Service.method2(new Methode2Entity("String1", "String2"));
        log.info("Method 2 result: {}", result);

        log.info("Legacy calls");
        MyClass myClass = new MyClass("Config", 10, "DatabaseUrl");


        myClass.method3();
        myClass.method4();
        myClass.method5();
        myClass.method6();
        myClass.method7();
        myClass.method8();
        myClass.method9();
        myClass.method10();

        log.info("End Main");

    }
}