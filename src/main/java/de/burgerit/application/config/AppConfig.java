package de.burgerit.application.config;

import de.burgerit.application.services.Methode1_5_Service;
import de.burgerit.legacy.myclass.MyClass;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    public AppConfig(Methode1_5_Service methode15Service) {
        MyClass.inject(methode15Service);
    }


}
