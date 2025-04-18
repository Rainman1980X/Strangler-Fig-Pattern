package de.burgerit.infrastructure.adapter.methode;


import de.burgerit.application.ports.Methode1Port;
import de.burgerit.domain.domain1.Methode1Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("methode1")
@RequiredArgsConstructor
public class Methode1 implements Methode1Port {

    @Override
    public void methode1(Methode1Entity configNew) {
        log.info("Method_ new: 1 executed {}", configNew);
    }
}
