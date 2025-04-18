plugins {
    java
}

group = "de.burgerit"
version = "1.0-SNAPSHOT"


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // Mindestens Java 17
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring Framework 6.2.6
    implementation("org.springframework:spring-core:6.2.6")
    implementation("org.springframework:spring-context:6.2.6")
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")

    //Logging
    implementation("org.slf4j:slf4j-api:2.0.17")
    runtimeOnly("ch.qos.logback:logback-classic:1.5.18")

    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")

    // Test
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testCompileOnly("org.projectlombok:lombok:1.18.38")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.38")
}

tasks.test {
    useJUnitPlatform()
}