**AIM**
  /*Create a base class named Employee that contains a method displayDetails() which prints general 
employee details such as name and department. Now create a subclass Manager that inherits from 
Employee and overrides the displayDetails() method to include additional information such as the 
manager's team size or project name. In the main method, create objects of both Employee and 
Manager classes and call the displayDetails() method using each object to show how Java 
determines which version of the method to execute at runtime. */

  class Employee {
    String name = "Ravi";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 10;
    String project = "Banking App";

    
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class TestEmployee {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.displayDetails();

        System.out.println();

        Employee m = new Manager();
        m.displayDetails();
    }
}
