
class Staff{

    String name;
	int salary;
	
	Staff(String name , int salary) {
	  this.name = name;
	  this.salary = salary;
	}

    void display() {
	   System.out.println("Name: "+ name +"Salary: "+ salary);
	
	}

}

class TeachingStaff extends Staff{
     
	String subject;
	
	  TeachingStaff(String name, int salary, String subject) {
        super(name, salary);  // call parent constructor
        this.subject = subject;
    }
	
    void display() {
	 System.out.println(" "+ name +" ->  "+ subject + "  " + salary);
	
	}

}

class NonTeachingStaff extends Staff{

    String department;
	
	 NonTeachingStaff(String name, int salary, String department) {
        super(name, salary);  // call parent constructor
        this.department = department;
    }

     void display() {
	    System.out.println(" "+ name +" -> "+ department + " , " + salary);
	
	}
}

class AcademicStaff{

    public static void main(String args[]){
	
	
	TeachingStaff ts = new TeachingStaff("Anita", 50000, "Math");
	ts.display();
	
	NonTeachingStaff nts = new NonTeachingStaff("Ramesh", 40000, "Admin");
	nts.display();
	
	
	
	}
}
