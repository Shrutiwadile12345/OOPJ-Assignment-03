class Vehicle{

     void displaySpeed(){
	    System.out.println("Vehicle speed unknown");
	 }
}

class Car extends Vehicle{

    int speed = 120;
	
	 @Override
     void displaySpeed(){
	    System.out.println("Car speed = " + speed + " km/h");
	 }
}

class Bike extends Vehicle{

    int speed = 80;
	
	@Override
    void displaySpeed(){
	    System.out.println("Bike speed = " + speed + " km/h");
	 }
}

class VehicleSpeedDisplay{


 public static void main(String args[]){
 
 Car c = new Car();
 c.displaySpeed();
 
 Bike b = new Bike();
 b.displaySpeed();
 
 }

}