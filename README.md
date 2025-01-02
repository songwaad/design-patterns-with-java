# Design Patterns with Java

This repository contains implementations of various **Design Patterns** using the **Java** programming language. Each design pattern is organized into its respective category to demonstrate its core concept and usage effectively.

---

## Overview

Design Patterns are reusable solutions to common software design problems. They help make code more **maintainable**, **reusable**, and **scalable**. In this repository, the patterns are grouped under three main categories:

1. **Creational Patterns** – Patterns focused on object creation.  
2. **Structural Patterns** – Patterns that help organize classes and objects.  
3. **Behavioral Patterns** – Patterns for communication between objects.

---

## Patterns Implemented

### 1. Creational Patterns

#### 1.1 Abstract Factory Method
- **Location**: `creational/abstract-factory-method`  
- **Overview**:  
  The Abstract Factory Method Pattern provides an interface for creating **families of related or dependent objects** without specifying their concrete classes. This decouples the client from the specific implementations of the objects.
- **Structure**:
  - **InsuranceFactory (Interface)**  
    Declares methods to create different types of insurance:  
    `createHealthInsurance()`, `createLifeInsurance()`, `createCarInsurance()`
  - **Concrete Factories**  
    - `BasicInsuranceFactory`  
    - `StandardInsuranceFactory`  
    - `PremiumInsuranceFactory`  
    Each factory creates a family of insurance objects (Basic, Standard, Premium).
  - **Insurance Types (Products)**  
    - HealthInsurance: `BasicHealthInsurance`, `StandardHealthInsurance`, `PremiumHealthInsurance`  
    - LifeInsurance: `BasicLifeInsurance`, `StandardLifeInsurance`, `PremiumLifeInsurance`  
    - CarInsurance: `BasicCarInsurance`, `StandardCarInsurance`, `PremiumCarInsurance`
  - **Client**  
    Uses a concrete factory to obtain insurance products without needing to know any implementation details.

---

#### 1.2 Builder Pattern
- **Location**: `creational/builder`
- **Overview**:  
  The Builder Pattern **separates** the construction of a **complex object** from its representation, allowing the same construction process to create various representations. This pattern is particularly useful when:
  - A product requires multiple steps to construct.  
  - Different representations of the constructed object are needed.
- **Structure**:
  - **Builder (Interface)**  
    Declares steps required to build a product. Each method returns the builder itself for method chaining (e.g., `buildCpu()`, `buildMainBoard()`, etc.).
  - **Concrete Builders**  
    - `OfficeComputerBuilder`  
    - `GamingComputerBuilder`  
    Provide specific implementations of the steps to build different types of computers.
  - **Director**  
    Orchestrates the building process by calling the builder’s methods in a specific order.
  - **Product**  
    In this example, the final product is a `Computer`.

---

#### 1.3 Factory Method
- **Location**: `creational/factory-method`
- **Overview**:  
  The Factory Method Pattern provides an interface for creating objects, but lets **subclasses** decide which class to instantiate. This promotes loose coupling by eliminating the need to bind application-specific classes into your code.
- **Structure**:
  - **Tea (Interface)**  
    Core interface representing tea.
  - **Concrete Tea Classes**:  
    `GreenTea`, `MilkTea`, `LemonTea`
  - **TeaCreator (Abstract Class)**  
    Declares the factory method and any shared logic.
  - **Concrete Creators**:  
    `GreenTeaCreator`, `MilkTeaCreator`, `LemonTeaCreator`

---

### 2. Structural Patterns

#### 2.1 Facade Pattern
- **Location**: `structural/facade`
- **Overview**:  
  The Facade Pattern provides a **unified interface** to a set of interfaces in a subsystem, making the subsystem easier to use. It acts as a **single entry point**, simplifying interactions between the client and complex subsystems.
- **Example**:  
  In this example, the `Avengers` class is the facade that simplifies access to capabilities of multiple subsystems:
  - `StephenStrange` (Doctor Strange)
  - `CarolDanvers` (Captain Marvel)
  - `TonyStark` (Iron Man)
- **Structure**:
  1. **Facade Class**: `Avengers.java`  
     - Methods such as `evacuatePeople(location)`, `attack(threat, threatLevel)`, `defend(threatLevel, location)`.
  2. **Subsystem Classes**:  
     - `StephenStrange.java`  
     - `CarolDanvers.java`  
     - `TonyStark.java`
  3. **Client**:  
     - `Client.java` uses the `Avengers` facade instead of calling subsystem methods directly.

---

**More patterns coming soon...**  

Happy coding!
