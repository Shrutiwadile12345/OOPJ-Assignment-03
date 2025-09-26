import java.util.Scanner;

class Sensor{
 
    private int temperature;
	
   void setTemperature(int n){
       if (n > 0 && n <= 100) {
         temperature = n;
	     System.out.println("Valid temperature!");
	   } else {
	      System.out.println("Temperature out of range!");
	   }
   }	

    int getTemperature() {
	    return temperature;
	}

}
class TemperatureSensor{

    public static void main(String args[]){
	 
	Scanner sc = new Scanner(System.in);
	Sensor s = new Sensor();
	
	System.out.println("Temperature: ");
	int temperature = sc.nextInt();
	
	s.setTemperature(temperature);
	 if (s.getTemperature() != 0) {
            System.out.println("Stored Temperature = " + s.getTemperature());
        }
	}
}