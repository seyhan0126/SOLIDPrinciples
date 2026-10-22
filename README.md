# SOLID Principles — Java Examples

A Java project dedicated to exploring **SOLID**, five object-oriented design principles that help make software easier to understand, extend, and maintain.

This repository is part of my software development portfolio and documents my practice with object-oriented design.

## The SOLID Principles

| Principle                                     | Meaning                                                                                            | Design Goal                                           |
| --------------------------------------------- | -------------------------------------------------------------------------------------------------- | ----------------------------------------------------- |
| **S — Single Responsibility Principle (SRP)** | A class should have one primary reason to change.                                                  | Keep responsibilities focused.                        |
| **O — Open/Closed Principle (OCP)**           | Software entities should be open for extension but closed for modification.                        | Add behavior without repeatedly changing stable code. |
| **L — Liskov Substitution Principle (LSP)**   | Subtypes should be usable wherever their base types are expected without breaking correctness.     | Preserve contracts across inheritance hierarchies.    |
| **I — Interface Segregation Principle (ISP)** | Clients should not depend on methods they do not use.                                              | Prefer focused interfaces.                            |
| **D — Dependency Inversion Principle (DIP)**  | High-level and low-level modules should depend on abstractions rather than directly on each other. | Reduce coupling and improve testability.              |

## Technologies

* **Java 21**
* **Maven**
* Object-Oriented Programming (OOP)

## Project Structure

The Java source code is located under:

```text
src/
└── main/
    └── java/
        └── org/
            └── server/
                └── SOLID/
```

The project uses `pom.xml` for Maven configuration and dependency management.

## Getting Started

### Prerequisites

Before running the project, make sure you have:

* JDK 21
* Maven
* Git (optional)
* IntelliJ IDEA or another Java-compatible IDE (optional)

### 1. Clone the Repository

```bash
git clone https://github.com/seyhan0126/SOLIDPrinciples.git
```

Navigate to the project directory:

```bash
cd SOLIDPrinciples
```

### 2. Compile the Project

```bash
mvn clean compile
```

### 3. Run the Examples

Open the project in IntelliJ IDEA or another Java IDE.

Navigate to:

```text
src/main/java/org/server/SOLID/
```

Select an example class and run it if it contains a `main()` method.

The repository is intended for exploring object-oriented design principles rather than running a single standalone application.

## Learning Objectives

The project focuses on understanding important software design concepts:

* Writing maintainable and readable Java code.
* Separating responsibilities between classes.
* Reducing coupling between software components.
* Using interfaces and abstractions effectively.
* Understanding inheritance and polymorphism.
* Designing extensible applications.
* Applying object-oriented design principles.
* Building a foundation for clean software architecture.

## Why SOLID Matters

SOLID principles provide guidelines for designing software systems that are easier to maintain, test, and extend.

They are particularly useful when developing larger applications where multiple components interact.

In Java backend development, these principles are commonly applied when designing:

* Service layers
* Repository abstractions
* Dependency injection
* Business logic components
* Interfaces and implementations
* Modular application architectures

Understanding SOLID helps developers make better architectural decisions and avoid unnecessary dependencies between components.

## Project Purpose

This repository was created to explore SOLID principles through Java programming.

It represents part of my continuous learning process and demonstrates my interest in software design, object-oriented programming, and maintainable backend architecture.

## Author

**Seyhan Mustafov**

GitHub: [seyhan0126](https://github.com/seyhan0126)
