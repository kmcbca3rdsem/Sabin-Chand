package Lab3.Inheritance;

// Grandparent class
class Person {
    String name = "Ram";

    void showName() {
        System.out.println("Name: " + name);
    }
}

// Parent class
class Employee extends Person {
    int empId = 101;

    void showEmpId() {
        System.out.println("Employee ID: " + empId);
    }
}

// Child class
class Manager extends Employee {
    String department = "Sales";

    void showDept() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class MultiLevel {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.showName(); // from Person
        m.showEmpId(); // from Employee
        m.showDept(); // from Manager
    }
}
