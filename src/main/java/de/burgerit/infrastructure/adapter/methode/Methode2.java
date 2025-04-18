package de.burgerit.infrastructure.adapter.methode;

import de.burgerit.application.ports.Methode2Port;
import de.burgerit.domain.domain1.Methode2Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("methode2")
@RequiredArgsConstructor
public class Methode2 implements Methode2Port {

    @Override
    public boolean method2(Methode2Entity information) {
        log.info("Method_ new: 2 executed {}", information);
        return information.getP1().equals(information.getP2());
    }
}
