class Account {
	
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

class SavingAccount extends Account {
	
    String interestRate;

    SavingAccount(int accountNo, double balance, String interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void displayAccount() {
        System.out.println("Saving -> " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate);
    }
}

class CurrentAccount extends Account {
    int overdraftLimit;

    CurrentAccount(int accountNo, double balance, int overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void displayAccount() {
        System.out.println("Current -> " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

class BankAccountTypes {
    public static void main(String args[]) {
      
        SavingAccount sa = new SavingAccount(101, 5000, "5%");
        CurrentAccount ca = new CurrentAccount(102, 10000, 2000);

        sa.displayAccount();
        ca.displayAccount();
    }
}
