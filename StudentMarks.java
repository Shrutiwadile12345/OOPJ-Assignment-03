import java.util.Scanner;

class Student{
  
    private int marks;
	
	void setMarks(int marks) {
	   if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        }
	}
    
	int getMarks() {
        return marks;
    }

}

class StudentMarks{
   
   public static void main(String args[]){
	   
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter marks: ");
        int inputMarks = sc.nextInt();

        Student s = new Student();

        s.setMarks(inputMarks);

        System.out.println("Marks = " + s.getMarks());

   }

}