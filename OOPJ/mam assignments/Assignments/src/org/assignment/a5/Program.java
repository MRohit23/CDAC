package org.assignment.a5;

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
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(String accountHolderName, double initialBalance, double withdrawalLimit) {
        super(accountHolderName, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds the limit of " + withdrawalLimit);
            return false;
        } else {
            return super.withdraw(amount);
        }
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double limit) {
        this.withdrawalLimit = limit;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

public class Program {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount("Jackie", 5000.0, 1000.0);
        

        savingsAccount.displayAccountDetails();

        savingsAccount.deposit(2000.0);
        
        
        savingsAccount.withdraw(800.0);

        
        savingsAccount.withdraw(1200.0);
        
        
        savingsAccount.displayAccountDetails();
    }
}
