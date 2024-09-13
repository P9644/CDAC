package assign5.ls;
class BankAccount {
 private String accountHolderName;
 private double balance;

 public BankAccount(String accountHolderName, double initialBalance) {
     this.accountHolderName = accountHolderName;
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(amount + " deposited. New balance: " + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println(amount + " withdrawn. Remaining balance: " + balance);
     } else {
         System.out.println("Insufficient balance or invalid withdrawal amount.");
     }
 }

 protected double getBalance() {
     return balance;
 }

 public String getAccountDetails() {
     return "Account Holder: " + accountHolderName + ", Balance: " + balance;
 }
}

class SavingsAccount extends BankAccount {
 private double withdrawalLimit;

 public SavingsAccount(String accountHolderName, double initialBalance, double withdrawalLimit) {
     super(accountHolderName, initialBalance);  
     this.withdrawalLimit = withdrawalLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (amount > withdrawalLimit) {
         System.out.println("Withdrawal amount exceeds the limit of " + withdrawalLimit);
     } else {
         super.withdraw(amount);  
     }
 }

 @Override
 public String getAccountDetails() {
     return super.getAccountDetails() + ", Withdrawal Limit: " + withdrawalLimit;
 }
}

public class BnkAccount {
 public static void main(String[] args) {
     BankAccount basicAccount = new BankAccount("John Doe", 1000);
     System.out.println(basicAccount.getAccountDetails());
     basicAccount.deposit(500);
     basicAccount.withdraw(200);

     System.out.println();

     SavingsAccount savingsAccount = new SavingsAccount("Jane Smith", 2000, 1000);
     System.out.println(savingsAccount.getAccountDetails());
     savingsAccount.deposit(300);
     savingsAccount.withdraw(1500); 
     savingsAccount.withdraw(500);   

     System.out.println();

     System.out.println(savingsAccount.getAccountDetails());
 }
}
/*1)	Create a base class BankAccount with methods like deposit() and withdraw(). Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount. Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.*/
