class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        // Base Employee shows only salary
        System.out.println(name + " Total Salary = " + salary);
    }
}

class Manager extends Employee {

    Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        int bonus = (salary * 20) / 100; // 20% bonus
        int totalSalary = salary + bonus;
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

class Developer extends Employee {

    Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        int bonus = (salary * 10) / 100; // 10% bonus
        int totalSalary = salary + bonus;
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

public class EmployeeSalaryDisplay {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);

        m.displaySalary();
        d.displaySalary();
    }
}
