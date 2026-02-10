package Lab3.Inheritance.MultipleInheritance;

// Interface
interface Bank {
    void deposit(double amount);
}

// Implementing class
class SavingAccount implements Bank {
    double balance = 100;

    public void deposit(double amount) {
        System.out.println("Initial Balance: " + balance);
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Total balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.deposit(5000);
    }
}
