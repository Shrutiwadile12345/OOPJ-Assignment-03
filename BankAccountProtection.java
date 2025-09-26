import java.util.Scanner;

class BankAccount {

    private double balance; 

   
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

  
    double getBalance() {
        return balance;
    }
}

public class BankAccountProtection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();

        System.out.print("Enter withdraw amount: ");
        double withdraw = sc.nextDouble();

        BankAccount b = new BankAccount();

        b.deposit(deposit);
        b.withdraw(withdraw);

        System.out.println("Updated Balance = " + b.getBalance());
    }
}
