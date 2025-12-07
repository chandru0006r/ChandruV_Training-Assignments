package JavaAssignment2;

import java.util.Scanner;

public class BankAccount {
    private String accountNo;
    private double balance;

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    
    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public void setInterestRate(double rate) {
        if (rate >= 0) {
            interestRate = rate;
        } else {
            System.out.println("Interest rate can't be negative");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

// Subclass SalaryAccount (no public keyword)
class SalaryAccount extends BankAccount {
    private double monthlySalary;

    public void setMonthlySalary(double salary) {
        if (salary >= 0) {
            monthlySalary = salary;
        } else {
            System.out.println("Monthly salary can't be negative");
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void creditSalary() {
        deposit(monthlySalary);
        System.out.println("Salary credited: " + monthlySalary);
    }
}

class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Savings Account Demo ===");
        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNo("SAV001");
        savings.deposit(10000);
        savings.setInterestRate(5);
        savings.addInterest();
        System.out.println("Savings balance: " + savings.getBalance());
        
        System.out.println("\n=== Salary Account Demo ===");
        SalaryAccount salary = new SalaryAccount();
        salary.setAccountNo("SAL002");
        salary.deposit(5000);
        salary.setMonthlySalary(75000);
        salary.creditSalary();
        salary.withdraw(20000);
        System.out.println("Salary account balance: " + salary.getBalance());
        
        sc.close();
    }
}
