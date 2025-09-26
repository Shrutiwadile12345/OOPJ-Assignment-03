abstract class Payment{

    abstract void pay();  //abstractt method 

}

class CreditCardPayment extends Payment {

   long CardNumber;
   double amount;
   
   CreditCardPayment(long CardNumber, double amount) {
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

class PaymentProcess{
   
   public static void main(String args[]){
   
   Payment p = new CreditCardPayment(1234567890123456l, 5000);
   p.pay();
   
   Payment p1 = new UPIPayment("rahul@upi", 2000);
   p1.pay();
   
   
   }

}