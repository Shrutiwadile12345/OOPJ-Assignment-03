class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("name = " + name + ", salary = " + salary);
    }
}

class TeachingStaff extends Employee {
    String subject;

    TeachingStaff(String name, int salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    void displaySalary() {
        System.out.println("name = " + name + ", salary = " + salary + ", subject = " + subject);
    }
}

class Professor extends TeachingStaff {
    String specialization;

    Professor(String name, int salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    void displaySalary() {
        System.out.println("name = " + name + ", subject = " + subject + ", specialization = " + specialization + ", salary = " + salary);
    }
}

class Lecturer extends TeachingStaff {
    String department;

    Lecturer(String name, int salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    void displaySalary() {
        System.out.println("name = " + name + ", subject = " + subject + ", department = " + department + ", salary = " + salary);
    }
}

public class CollegeStaffHierarchy {
    public static void main(String[] args) {
        Professor p = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        p.displaySalary();

        Lecturer l = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");
        l.displaySalary();
    }
}
