package de.burgerit;

import de.burgerit.myclass.MyClass;
import de.burgerit.myclass.context.MyClassContext;
import de.burgerit.myclass.context.MyClassContextFactory;

public class Main {

    public static void main(String[] args) {

        MyClassContext context = MyClassContextFactory.createApplicationContext("production",
                10,
                "jdbc:mysql://production-db:3306/myapp");

        MyClass myClass = (MyClass) context.getInstance("legacyClass");
        myClass.method1("ConfigSet");

        if(myClass.method2("String1","String2")){
            System.out.println("Method 2 executed from Main");
        } else {
            System.out.println("Method 2 'not' executed from Main");
        }

        myClass.method3();
        myClass.method4();
        myClass.method5();
        myClass.method6();
        myClass.method7();
        myClass.method8();
        myClass.method9();
        myClass.method10();

    }
}