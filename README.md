
# Strangler Fig Pattern — Context-based Migration (Java)

This project demonstrates a context-based migration strategy using the *Strangler Fig Pattern* in Java with Gradle.

Instead of replacing the entire legacy codebase at once, this approach wraps existing code with a context-aware facade and incrementally routes new functionality into separate, isolated action classes.

---

## Core Idea

- Context-aware class routing
- Legacy functionality remains untouched
- New functionality implemented as `Action` classes
- `ContextFactory` dynamically provides the correct implementation

---

## Project Structure

```
src/java/
│
├── MyClass.java               → Legacy Entry Point
├── MyClassContext.java        → Context Interface for Routing
├── MyClassContextFactory.java → Factory for Context Decision
│
├── Action/
│   ├── Method1Action.java     → New Implementation of Method1
│   └── Method2Action.java     → New Implementation of Method2
│
├── Value.java / ValueMap.java → Supporting Data Objects
└── Main.java                  → Application Entry Point
```

---

## How it works

```java
// Example inside MyClass.java

MyClassContext context = MyClassContextFactory.create(valueMap);

context.method1();
context.method2();
```

- Old logic stays in `MyClass`
- New logic grows in `Action` classes
- Context Factory decides dynamically which implementation to use

---

## Build & Run

### Build

```bash
./gradlew build
```

### Run

```bash
./gradlew run
```

### Test

```bash
./gradlew test
```

---

## Benefits of this Approach

- Minimal risk during migration
- Legacy & New Code co-exist
- Easy to test new features independently
- Clean separation of concerns
- Scalable migration strategy

---

## License

Apache License, Version 2.0
[https://www.apache.org/licenses/LICENSE-2.0.txt]
---

## Author

Matthis Burger — [info@burger-it.de]
