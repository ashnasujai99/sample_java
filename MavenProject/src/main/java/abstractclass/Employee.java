//Let's first create the superclass Employee and
//define a method called calculateSalary() as an
//abstract method. The Contractor class inherits all
//properties from its parent Employee but have to
//provide its own implementation of calculateSalary()
//method and multiply the value of payment
//per hour with given working hours. The
//Full TimeEmployee also has its own implementation
//of
//calculateSalary() method. In this case we just
//multiply by constant 8 hours.
package abstractclass;
public abstract class Employee {
    public abstract void calculateSalary();
}

