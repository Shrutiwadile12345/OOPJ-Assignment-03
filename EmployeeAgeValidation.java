import java.util.Scanner;

class Employee{
 
    private int age;
	
	void setage(int age) {
	   if (age >= 18){
	      this.age = age; 
	   } else {
	      System.out.println("Invalid age! Must be 18 or above.");
	   }
	}

    int getAge() {
	   return age;
	}
}

class EmployeeAgeValidation {
 
    public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	
	Employee e1 = new Employee();
	e1.setage(age);
	
	  if (e1.getAge() != 0) {  
            System.out.println("Age = " + e1.getAge());
        }
	}
}