package com.java.designpatternsproject.behavioral.templatemethod;

public class DollarAccount extends AccountManager {
    private String currencySymbol = "USD";
    private double interestRatePercent = 15.0;
    private String ownerName;
    private String accountNumber;
    private int accountLifetimeInMonths;
    private double accountBalance;
    private double loanAmount;

    public DollarAccount(String ownerName, String accountNumber, double accountBalance,
                         double loanAmount, int accountLifetimeInMonths) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.loanAmount = loanAmount;
        this.accountLifetimeInMonths = accountLifetimeInMonths;
    }

    @Override
    void showAccountDetails() {
        System.out.println("Account details: \n" +
                "Właściciel: " + ownerName + "\n" +
                " Numer konta: " + accountNumber + "\n" +
                " Stan konta: " + accountBalance + "\n" +
                " Waluta: " + currencySymbol + "\n" +
                " Oprocentowanie: " + interestRatePercent + "\n" +
                " Wysokość pożyczki: " + loanAmount + "\n");
    }

    @Override
    void countInterests() {
        double extraCost = 129.99;
        double interests = loanAmount * interestRatePercent - extraCost;
        System.out.println("Amount of interests: " + interests);
        System.out.println("Extra cost from loan: " + extraCost);
    }

    @Override
    void countMaxPossibleLoad() {
        int oneMonthLoanAmount = 1000;
        int maxAmount = oneMonthLoanAmount * accountLifetimeInMonths;
        System.out.println("Maximal amount of loan possible to get: " + maxAmount);
    }
}