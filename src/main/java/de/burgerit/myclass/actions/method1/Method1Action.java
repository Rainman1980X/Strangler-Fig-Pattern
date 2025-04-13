package de.burgerit.myclass.actions.method1;

import de.burgerit.myclass.actions.Action;
import de.burgerit.myclass.context.MyClassContext;
import de.burgerit.values.ValueMap;

public class Method1Action implements Action<Void, ValueMap> {

    private final MyClassContext context;

    public Method1Action(MyClassContext context) {
        this.context = context;
    }

    @Override
    public Void execute(ValueMap params) {
        System.out.println("\n\nMethod 1 executed from Method1Action");
        System.out.println("Getting from Context: Configuration: "+context.getConfiguration());
        System.out.println("Change Configuration: New Configuration ");
        context.setConfiguration("New Configuration");
        System.out.println("Getting from Context: Configuration: "+context.getConfiguration());
        System.out.println("Getting from Context: Threshold: " +context.getThreshold());
        System.out.println("Getting from Context: DatabaseUrl: " + context.getDatabaseUrl());




        return null;
    }
}
