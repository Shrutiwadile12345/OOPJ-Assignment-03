abstract class Employee{
   
   String name;
   int salary;
   
   Employee(String name, int salary) {
     this.name = name;
	 this.salary = salary;
   }
   
  abstract void calculateBonus();
}

class Manager extends Employee{
   
   int bonus = (salary / 20)*100;
   
   Manager(String name,int salary) {
     super(name, salary);
	 this.bonus = bonus;
   }
    
   void calculateBonus() {
	  System.out.println(" " + name + " Bonus = " + bonus);
   }

}

class Developer extends Employee{

    int bonus = (salary / 10)*100;
	
	Developer(String name, int salary) {
	   super(name, salary);
	   this.bonus = bonus;
	}
	
	void calculateBonus() {
	  System.out.println(" " + name + " Bonus = " + bonus);
   }

}

class EmployeeBonusCalculation{
 
 public static void main(String args[]){
 
 Manager m = new Manager("Anita", 50000);
 m.calculateBonus();
 
 Developer d = new Developer("Rohit", 40000);
 d.calculateBonus();
 
 }

}