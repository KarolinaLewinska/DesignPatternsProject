package com.java.designpatternsproject.behavioral.templatemethod;

public abstract class AccountManager {
    abstract void showAccountDetails();
    abstract void countInterests();
    abstract void countMaxPossibleLoad();

    public void processAccountMethods() {
        showAccountDetails();
        countInterests();
        countMaxPossibleLoad();
    }
}