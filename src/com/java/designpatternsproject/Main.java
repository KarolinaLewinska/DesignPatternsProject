package com.java.designpatternsproject;

import com.java.designpatternsproject.patternsrunners.BehavioralPatternsRunners;
import com.java.designpatternsproject.patternsrunners.CreationalPatternsRunners;
import com.java.designpatternsproject.patternsrunners.StructuralPatternsRunners;

public class Main {
    public static void main(String[] args)  {
        CreationalPatternsRunners.runSingleton();
        CreationalPatternsRunners.runFactory();
        CreationalPatternsRunners.runPrototype();

        StructuralPatternsRunners.runAdapter();
        StructuralPatternsRunners.runBridge();
        StructuralPatternsRunners.runComposite();

        BehavioralPatternsRunners.runIterator();
        BehavioralPatternsRunners.runTemplateMethod();
        BehavioralPatternsRunners.runCommand();
        BehavioralPatternsRunners.runMediator();
        BehavioralPatternsRunners.runObserver();
        BehavioralPatternsRunners.runStrategy();
    }
}