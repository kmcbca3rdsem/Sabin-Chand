package Lab3.exceptionhandling;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Balance is low!");
        }
        balance -= amount;
        System.out.println("Withdraw successful. Remaining: " + balance);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        try {
            b.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
