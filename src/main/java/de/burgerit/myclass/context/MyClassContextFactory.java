package de.burgerit.myclass.context;

import de.burgerit.myclass.MyClass;
import de.burgerit.myclass.actions.method1.Method1Action;
import de.burgerit.myclass.actions.method2.Method2Action;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyClassContextFactory {

    public static MyClassContext createApplicationContext(String configuration, int threshold, String databaseUrl) {
        var context = new MyClassContext(configuration, threshold, databaseUrl);

        var myClass = new MyClass(configuration, threshold, databaseUrl);
        myClass.registerAction("method1", new Method1Action(context))
                        .registerAction("method2", new Method2Action(context));

        context.registerInstance("legacyClass", myClass);
        return context;
    }
}
