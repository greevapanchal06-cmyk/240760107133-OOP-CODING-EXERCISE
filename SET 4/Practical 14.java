**AIM**
/* Define a base class BankAccount with common attributes like accountNumber, 
accountHolderName, and balance. Then, define two subclasses: SavingAccount and 
FixedDepositAccount, which inherit from BankAccount. Implement basic operations like 
openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The SavingAccount 
should include a calculateInterest() method specific to savings accounts, and FixedDepositAccount 
should have a maturityAmount() method considering fixed deposit terms. */

import java.util.*;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance + (balance * 0.07 * years); // 7% per year
    }
}

public class TestBankAccount {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount();
        sa.openAccount();
        sa.deposit(2000);
        sa.checkBalance();
        System.out.println("Saving Interest = " + sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount();
        System.out.println("Maturity Amount (3 years) = " + fd.maturityAmount(3));
    }
}
