package com.java.designpatternsproject;

import com.java.designpatternsproject.creational.singleton.ConfigFileSingleton;

import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        runSingleton();
    }

    public static void runSingleton() {
        try {
            ConfigFileSingleton configFileInstance = ConfigFileSingleton.getInstance();
            ConfigFileSingleton configFileInstance2 = ConfigFileSingleton.getInstance();
            if (configFileInstance.getConfigFilePath() == configFileInstance2.getConfigFilePath()) {
                System.out.println("Only one instance of db config file");
            }
        } catch (IOException exc) {
            throw new RuntimeException("Exception occurred during creating singleton instance");
        }
    }
}