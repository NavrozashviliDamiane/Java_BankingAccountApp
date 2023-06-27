import java.util.Scanner;

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert account number: ");
        int accountnumber = scanner.nextInt();
        System.out.print("Please insert account money amount: ");
        double accounamount = scanner.nextDouble();
        BankAccount account1 = new BankAccount( accountnumber, accounamount);

        System.out.print("Enter deposit amount for Account (or enter '0' to finish): ");
        double depositAmount = scanner.nextDouble();

        while (depositAmount != 0) {
            account1.deposit(depositAmount);
            System.out.print("Enter deposit amount for Account 1 (or enter '0' to finish): ");
            depositAmount = scanner.nextDouble();
        }

        System.out.println("Account 1 Balance: $" + account1.getAccountBalance());


    }
}