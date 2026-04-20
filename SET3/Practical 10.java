**AIM**
  /*Design a class BankAccount with account_holder_name and balance. Use a static variable interest_rate (same for all accounts). 
    Include methods to calculate and display the interest earned. SHREE SWAMI ATMANAND SARASWATI INSTITUTE OF TECHNOLOGY 
COMPUTER ENGINEERING DEPARTMENT Update interest rate using a static method. */

  import java.util.*;

class BankAccount {
    String account_holder_name;
    double balance;

    static double interest_rate = 5.0; // same for all accounts

    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

  
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }
}

public class TestBank {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Amit", 10000);
        BankAccount b2 = new BankAccount("Neha", 20000);

        System.out.println("Before updating interest rate:");
        b1.display();
        b2.display();

        
        BankAccount.updateInterestRate(7.5);

        System.out.println("\nAfter updating interest rate:");
        b1.display();
        b2.display();
    }
}
