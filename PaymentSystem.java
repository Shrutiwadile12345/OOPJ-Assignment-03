abstract class Payment{

    abstract void pay();  //abstractt method 

}

class CreditCardPayment extends Payment {

   int CardNumber;
   double amount;
   
   CreditCardPayment(int CardNumber, double amount) {
      this.CardNumber = CardNumber;
	  this.amount = amount;
   }
   
   void pay() {
      System.out.println("Payment via Credit Card  " + CardNumber + "->  " + "Rs. " + amount);
   }
}

class UPIPayment extends Payment{

    String upiId;
	double amount;
	
	UPIPayment(String upiId, double amount) {
	    this.upiId = upiId;
		this.amount = amount;
	}
	
	void pay() {
      System.out.println("Payment via UPI " + upiId + "->  " + "Rs. " + amount);
   }
}

class PaymentSystem{
   
   public static void main(String args[]){
   
   CreditCardPayment cp = new CreditCardPayment(1234567890 , 5000.7643);
   cp.pay();
   
   UPIPayment up = new UPIPayment("rahul@upi", 2000);
   up.pay();
 
   }

}