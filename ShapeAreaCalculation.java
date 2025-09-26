

class ShapeArea{

   int side;
   int length, breadth;
   double radius;
   
    final double pi = 3.14;  
	//using final variable i.e. constant
  
   void calculateArea(int side){
     System.out.println("Square Area =  " + side * side);
   }
   
   void calculateArea(int length, int breadth){
     System.out.println("Rectangle Area =  " + length * breadth);
   }
   
    void calculateArea(double radius){
     System.out.printf("Circle Area :  %.2f%n",  pi * radius * radius);
   }
}


class ShapeAreaCalculation{

   public static void main(String args[]){
   
   ShapeArea s1 = new ShapeArea();
   ShapeArea s2 = new ShapeArea(); 
   ShapeArea s3 = new ShapeArea();
   
   s1.calculateArea(5);
   s2.calculateArea(4, 6);
   s3.calculateArea((double)3);  //type casting and '%.2f%n' is for 2 digits after decimal values .  
   
   }

}