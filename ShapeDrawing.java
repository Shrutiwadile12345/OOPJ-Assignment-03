abstract class Shape{

  abstract void draw();
}

class Circle extends Shape{

   int radius;
   
   Circle(int radius) {
     this.radius = radius;
   }
   
   void draw() {
     System.out.println("Drawing Circle of radius " + radius);
   }
}

class Rectangle extends Shape{

   int length;
   int breadth;
   
   Rectangle(int length, int breadth) {
     this.length = length;
     this.breadth = breadth;
   }
   
   void draw() {
     System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
   }
}

class ShapeDrawing{

   public static void main(String args[]){
   
   Circle c = new Circle(7);
   Rectangle r = new Rectangle(5, 10);
   
   c.draw();
   r.draw();
   
   }

}