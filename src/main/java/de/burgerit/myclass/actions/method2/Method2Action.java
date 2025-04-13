package de.burgerit.myclass.actions.method2;

import de.burgerit.myclass.actions.Action;
import de.burgerit.myclass.context.MyClassContext;
import de.burgerit.values.ValueMap;

public class Method2Action implements Action<Boolean, ValueMap> {

    private final MyClassContext context;

    public Method2Action(MyClassContext context) {
        this.context = context;
    }

    @Override
    public Boolean execute(ValueMap params) {
        System.out.println("\n\nMethod 2 executed from Method2Action");
        System.out.println("Getting from Context: Configuration: "+context.getConfiguration());
        System.out.println("Getting from Context: Threshold: " +context.getThreshold());
        System.out.println("Getting from Context: DatabaseUrl: " + context.getDatabaseUrl());
        System.out.println("Getting from Functioncal: Prama1: " +params.getValue("Param1"));
        System.out.println("Getting from Functioncal: Prama2: " + params.getValue("Param2"));


        return true;
    }
}
