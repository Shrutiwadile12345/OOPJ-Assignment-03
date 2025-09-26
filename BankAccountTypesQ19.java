class Account {
	
    int accountNumber;
	String accountHolder;
    double balance;

    Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
        this.balance = balance;
    }
	
	void displayBalance(){
	     System.out.println(accountHolder + " -> Balance = " + balance);
	}
}

class SavingsAccount extends Account {
	
    String interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, String interestRate ) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        System.out.println( accountHolder +  " -> "  + " Balance=" + balance + ", Interest=" + interestRate);
    }
}

class CurrentAccount extends Account {
    int overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, int overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println( accountHolder + " -> "  + ", Balance=" + balance + ", Overdraft Limit=" + overdraftLimit);
    }
}

class BankAccountTypesQ19 {
    public static void main(String args[]) {
      
        SavingsAccount sacc = new SavingsAccount(101, "Anita", 5000.0, "5%");
        CurrentAccount cacc = new CurrentAccount(102, "Rohit" , 10000.0, 2000);

        sacc.calculateInterest();
        cacc.checkOverdraft();
    }
}
