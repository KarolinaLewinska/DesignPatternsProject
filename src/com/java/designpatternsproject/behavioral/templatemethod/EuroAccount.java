package com.java.designpatternsproject.behavioral.templatemethod;

public class EuroAccount extends AccountManager {
    private String currencySymbol = "EUR";
    private double interestRatePercent = 10.0;
    private String ownerName;
    private String accountNumber;
    private double accountBalance;
    private double loanAmount;
    private int accountLifetimeInMonths;

    public EuroAccount(String ownerName, String accountNumber, double accountBalance,
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
        double interests = loanAmount * interestRatePercent;
        System.out.println("Amount of interests: " + interests);
    }

    @Override
    void countMaxPossibleLoad() {
        int oneMonthLoanAmount = 2000;
        int maxAmount = oneMonthLoanAmount * accountLifetimeInMonths;
        if (accountLifetimeInMonths >= 120) {
            maxAmount = maxAmount + 10000;
        }
        System.out.println("Maximal amount of loan possible to get: " + maxAmount);
    }
}
