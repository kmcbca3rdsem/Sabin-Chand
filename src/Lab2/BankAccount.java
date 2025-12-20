package Lab2;
import java.util.Scanner;

public class BankAccount {
    long accountNumber;
    double balance;

    BankAccount(long accN, double blc){
        this.accountNumber=accN;
        this.balance=blc;
    }
    void Bank(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations to Perform: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Current Balance");
        int choices = sc.nextInt();
        switch (choices){
            case 1:
                System.out.println("Enter the Deposit Amount:");
                double dpAmt = sc.nextLong();
                this.balance = this.balance + dpAmt;
                System.out.println("Successfully Deposited!");
                System.out.println("Balance Now: "+this.balance);
                break;
            case 2:
                System.out.println("Enter the Withdraw Amount:");
                double wtAmt = sc.nextLong();
                this.balance = this.balance - wtAmt;
                System.out.println("Successfully Withdrawn!");
                System.out.println("Balance Now: "+this.balance);
                break;
            case 3:
                System.out.println("Balance Now: "+this.balance);
                break;
            default:
                System.out.println("Invalid Input!");
                break;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number and Initial Balance: ");
        BankAccount bankAccount = new BankAccount(sc.nextLong(),sc.nextDouble());
        while(true){
            bankAccount.Bank();
        }
    }
}
