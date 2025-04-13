package de.burgerit.myclass.context;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class MyClassContext {

    // Ursprüngliche Klassenvariablen
    private String configuration;
    private int threshold;
    private String databaseUrl;


    private final Map<String, Object> registeredInstances = new HashMap<>();


    // Methode, um eine bereits erstellte Instanz im Context zu registrieren
    public void registerInstance(String name, Object instance) {
        registeredInstances.put(name, instance);
    }

    // Methode, um eine bereits registrierte Instanz zu holen
    public Object getInstance(String name) {
        if (registeredInstances.containsKey(name)) {
            return registeredInstances.get(name);
        }
        throw new IllegalArgumentException("Instance not registered: " + name);
    }

}
