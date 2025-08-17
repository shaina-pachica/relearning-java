public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);

        // Check balance:
        savings.checkBalance();

        // Withdrawing:
        savings.withdraw(300);

        // Check balance:
        savings.checkBalance();

        // Deposit:
        savings.deposit(600);

        // Check balance:
        savings.checkBalance();

        // Deposit:
        savings.deposit(600);

        // Check balance:
        savings.checkBalance();

        // Display the recent savings account details
        System.out.println(savings);
    }
}
