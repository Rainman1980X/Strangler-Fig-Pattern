package de.burgerit.legacy.myclass;

import de.burgerit.application.exception.IsMigratedException;
import de.burgerit.application.services.Methode1_5_Service;
import de.burgerit.infrastructure.adapter.legacy.Methode1Converter;
import de.burgerit.infrastructure.adapter.legacy.Methode2Converter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
public class MyClass implements IMyClass {

    private String configuration;
    private int threshold;
    private String databaseUrl;

    private final IMyClass legacy = new MyClass_Legacy(configuration, threshold, databaseUrl);

    private static Methode1_5_Service methode1_5Service;

    public static void inject(Methode1_5_Service methode15Service){
        MyClass.methode1_5Service = methode15Service;
    }

    @Deprecated(forRemoval = true)
    @Override
    public void method1(String c) {
       throw new IsMigratedException();
    }

    @Deprecated(forRemoval = true)
    @Override
    public boolean method2(String p1, String p2) {
        throw new IsMigratedException();
    }

    @Override
    public void method3() {
        legacy.method3();
    }

    @Override
    public void method4() {
        legacy.method4();
    }

    @Override
    public void method5() {
        legacy.method5();
    }

    @Override
    public void method6() {
        legacy.method6();
    }

    @Override
    public void method7() {
        legacy.method7();
    }

    @Override
    public void method8() {
        legacy.method8();
    }

    @Override
    public void method9() {
        legacy.method9();
    }

    @Override
    public void method10() {
        legacy.method10();
    }
}