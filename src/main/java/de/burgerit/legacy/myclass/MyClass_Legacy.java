package de.burgerit.legacy.myclass;

import de.burgerit.application.exception.IsMigratedException;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Deprecated(forRemoval = true)
public class MyClass_Legacy implements IMyClass {

    private String configuration;
    private int threshold;
    private String databaseUrl;

    @Override
    @Deprecated
    public void method1(String configNew) {
        throw new IsMigratedException();
    }

    @Override
    public boolean method2(String param1, String param2) {
        throw new IsMigratedException();
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