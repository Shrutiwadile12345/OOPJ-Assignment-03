import java.util.Scanner;

class Shape{

    void area() {
	    System.out.println("Area: ");
	}
	
}

class Rectangle extends Shape{

   int length;
   int breadth;
   
   Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
   
   void area() {
      System.out.println("Area of Rectangle: "+ (length * breadth));
   }
}

class Circle extends Shape{

    int radius;
	double pi = 3.14;

    Circle(int radius) {
        this.radius = radius;
    }
	
    void area() {
	    System.out.println("Area of Circle: " + (radius * radius * pi));
	}
	
}

class CalculateArea{

   public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter length: ");
   int length = sc.nextInt();
   
   System.out.println("Enter breadth: ");
   int breadth = sc.nextInt();
   
   Rectangle r = new Rectangle(length, breadth);
   r.area();
   
   System.out.println("Enter radius: ");
   int radius = sc.nextInt();
   
   Circle c = new Circle(radius);
   c.area();
  
   }
   
}