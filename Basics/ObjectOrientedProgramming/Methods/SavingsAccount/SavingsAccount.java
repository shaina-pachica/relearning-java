public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("\nHello! \nYour balance is currently " + balance + ".\n");
    }

    public void withdraw(int withdrawAmount) {
        int afterWithdraw = balance - withdrawAmount;
        balance = afterWithdraw;
        System.out.print(withdrawAmount + " was deducted to your Savings Account balance. Happy to serve you!\n");
    }

    public void deposit(int depositAmount) {
        int afterDeposit = balance + depositAmount;
        balance = afterDeposit;
        System.out.println(depositAmount + " was added to your Savings Account balance. Happy to serve you!\n");
    }

    public String toString() {
        return "\nThis is a Savings Account (SA) with " + balance + " saved.\n";
    }
}