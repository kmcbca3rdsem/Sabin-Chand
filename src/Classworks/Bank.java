package Classworks;

class Bank {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 7000;

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            }
            balance = balance - withdraw;
            System.out.println("Transaction Successful");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
