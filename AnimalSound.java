import java.util.Scanner;

class Animal{

   void makeSound() {
   
   }

}

class Dog extends Animal{

    void makeSound() {
	  System.out.println("Bark !");
	
	}

}

class Cat extends Animal{

    void makeSound(){
	  System.out.println("Meowwwwwwww !");
	}

}

class AnimalSound{
 
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("---------------- Animal Voice ------------");
   
   Dog d = new Dog();
   d.makeSound();
   
   Cat c = new Cat();
   c.makeSound();
   }

}