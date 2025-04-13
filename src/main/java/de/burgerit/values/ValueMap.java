package de.burgerit.values;

import java.util.HashMap;
import java.util.Map;

public class ValueMap {

    private final Map<String, Value<?>> valueStore = new HashMap<>();

    public <V> ValueMap addValue(String name, Value<V> value) {
        valueStore.put(name, value);
        return this;
    }

    @SuppressWarnings("unchecked")
    public <V> V getValue(String name) {
        return valueStore.get(name) == null ? null : (V) valueStore.get(name).getValue();
    }

    public boolean hasValues(String name) {
        return valueStore.containsKey(name);
    }
}
