package de.burgerit.infrastructure.adapter.legacy;

import de.burgerit.domain.domain1.Methode2Entity;
import lombok.extern.slf4j.Slf4j;

@Deprecated(forRemoval = true)
@Slf4j
public class Methode2Converter {
    public static Methode2Entity convert(String p1, String p2){
        return new Methode2Entity(p1,p2);
    }
}
