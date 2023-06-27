
public class BankAccount {
    private int accountNumber;
    private double accountBalance;

    public BankAccount(int accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            accountBalance =+ amount;
            System.out.print("You added money: " + amount);
        } else {
            System.out.print("Invalid amount, please try again later");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && accountBalance>amount) {
            accountBalance =- amount;
            System.out.print("You withdrawned money: " + amount);
        } else {
            System.out.print("Invalid amount, please try again later");
        }
    }
}