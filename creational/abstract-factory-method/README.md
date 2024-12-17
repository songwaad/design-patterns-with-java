# Abstract Factory Method Pattern

## Overview
The **Abstract Factory Method Pattern** provides an interface for creating families of related or dependent objects **without specifying their concrete classes**. This ensures that the client code is decoupled from the specific implementations of the objects.

---

## Class Diagram

Below is the class diagram for the Abstract Factory Method Pattern:

![Abstract Factory Method Diagram](abstract-factory-method-diagram.png)

---

## Structure

1. **InsuranceFactory** *(Interface)*  
   - Defines the abstract methods for creating different types of insurance:
     - `createHealthInsurance()`
     - `createLifeInsurance()`
     - `createCarInsurance()`

2. **Concrete Factories**  
   Implement the `InsuranceFactory` interface to create specific families of insurance:  
   - **BasicInsuranceFactory**  
   - **StandardInsuranceFactory**  
   - **PremiumInsuranceFactory**  

3. **Insurance Types (Products)**  
   Families of related products:  
   - **HealthInsurance**: Includes `BasicHealthInsurance`, `StandardHealthInsurance`, `PremiumHealthInsurance`.  
   - **LifeInsurance**: Includes `BasicLifeInsurance`, `StandardLifeInsurance`, `PremiumLifeInsurance`.  
   - **CarInsurance**: Includes `BasicCarInsurance`, `StandardCarInsurance`, `PremiumCarInsurance`.  

4. **Client**  
   - The client uses a factory to get an insurance product without needing to know its concrete class.
