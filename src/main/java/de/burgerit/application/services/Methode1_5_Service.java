package de.burgerit.application.services;


import de.burgerit.application.ports.Methode1Port;
import de.burgerit.application.ports.Methode2Port;
import de.burgerit.domain.domain1.Methode1Entity;
import de.burgerit.domain.domain1.Methode2Entity;
import de.burgerit.infrastructure.adapter.methode.Methode1;
import de.burgerit.infrastructure.adapter.methode.Methode2;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
public class Methode1_5_Service {


    private Methode1Entity configNew;
    private final Methode1Port methode1Port = new Methode1();
    private final Methode2Port methode2Port = new Methode2();

    public void methode1(Methode1Entity configNew) {
        this.configNew = configNew;
        methode1Port.methode1(configNew);
    }

    public boolean method2(Methode2Entity information) {
        return methode2Port.method2(information);
    }
}
