package de.burgerit.myclass;

import de.burgerit.myclass.actions.Action;
import de.burgerit.values.Value;
import de.burgerit.values.ValueMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class MyClass implements IMyClass {

    // Map für Aktionen nach Namen
    private final HashMap<String, Action<?, ?>> actions = new HashMap<>();

    private String configuration;
    private int threshold;
    private String databaseUrl;

    // Setter zum Registrieren von Aktionen
    public MyClass registerAction(String methodName, Action<?, ?> action) {
        actions.put(methodName, action);
        return this;
    }

    @Override
    public void method1(String configNew) {
        if (actions.containsKey("method1")) {
            ValueMap params = new ValueMap();
            params.addValue("Param1", new Value<>(configNew));

            @SuppressWarnings("unchecked")
            var method1Action = (Action<Void, ValueMap>) actions.get("method1");
            method1Action.execute(params);
        } else
            throw new IllegalArgumentException("Action not registered: method2");
    }

    @Override
    public boolean method2(String param1, String param2) {
        if (actions.containsKey("method2")) {
            ValueMap params = new ValueMap();
            params.addValue("Param1", new Value<>(param2))
                            .addValue("Param2", new Value<>(param2));

            @SuppressWarnings("unchecked")
            var method2Action = (Action<Boolean, ValueMap>) actions.get("method2");
            return method2Action.execute(params);
        } else
            throw new IllegalArgumentException("Action not registered: method2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 executed");
    }

    @Override
    public void method4() {
        System.out.println("Method 4 executed");
    }

    @Override
    public void method5() {
        System.out.println("Method 5 executed");
    }

    @Override
    public void method6() {
        System.out.println("Method 6 executed");
    }

    @Override
    public void method7() {
        System.out.println("Method 7 executed");
    }

    @Override
    public void method8() {
        System.out.println("Method 8 executed");
    }

    @Override
    public void method9() {
        System.out.println("Method 9 executed");
    }

    @Override
    public void method10() {
        System.out.println("Method 10 executed");
    }
}