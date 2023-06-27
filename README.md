# Java_BankingAccountApp

Description of the Program:

The provided program is a simple Bank Account Management System implemented using Java. It consists of two classes: BankAccount and BankAccountManagementSystem.

The BankAccount class represents a bank account and has the following properties:

accountNumber: An integer representing the account number.
accountBalance: A double representing the current balance of the account.
The class includes a constructor that takes an account number and initial balance as arguments and initializes the corresponding fields. It also provides getter methods (getAccountNumber and getAccountBalance) to retrieve the account number and balance.

The class includes two methods, deposit and withdraw, which allow deposits and withdrawals to be made on the account. The deposit method takes an amount as input, checks if it is a positive value, and adds it to the account balance if valid. The withdraw method takes an amount as input, checks if it is a positive value and if the account balance is sufficient, and subtracts it from the account balance if valid.

The BankAccountManagementSystem class contains the main method, which acts as the entry point for the program. It utilizes the Scanner class to accept user input from the console.

In the main method, the user is prompted to enter the account number and initial balance for a bank account. Then, the user is asked to enter deposit amounts multiple times until they enter 0 to finish. Each deposit amount is added to the account balance using the deposit method of the BankAccount class. Finally, the current balance of the account is displayed on the console.

Overall, the program allows users to create a bank account, make deposits, and view the updated balance. It demonstrates basic input/output operations, object creation, method invocation, and data manipulation in Java.
