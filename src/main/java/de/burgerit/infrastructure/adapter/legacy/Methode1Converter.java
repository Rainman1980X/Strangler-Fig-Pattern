package de.burgerit.infrastructure.adapter.legacy;

import de.burgerit.domain.domain1.Methode1Entity;
import lombok.extern.slf4j.Slf4j;

@Deprecated(forRemoval = true)
@Slf4j
public class Methode1Converter {

    public static Methode1Entity convert(String configNew) {
        log.info("Method_ new: 1 executed {}", configNew);
        return new Methode1Entity(configNew);
    }
}
