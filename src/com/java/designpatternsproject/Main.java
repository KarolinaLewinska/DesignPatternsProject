package com.java.designpatternsproject;

import com.java.designpatternsproject.patternsrunners.BehavioralPatternsRunners;
import com.java.designpatternsproject.patternsrunners.CreationalPatternsRunners;
import com.java.designpatternsproject.patternsrunners.StructuralPatternsRunners;

public class Main {
    public static void main(String[] args)  {
        CreationalPatternsRunners.runSingleton();
        CreationalPatternsRunners.runFactory();
        CreationalPatternsRunners.runPrototype();
        CreationalPatternsRunners.runAbstractFactory();
        CreationalPatternsRunners.runBuilder();

        StructuralPatternsRunners.runAdapter();
        StructuralPatternsRunners.runBridge();
        StructuralPatternsRunners.runComposite();
        StructuralPatternsRunners.runDecorator();
        StructuralPatternsRunners.runFacade();
        StructuralPatternsRunners.runFlyweight();
        StructuralPatternsRunners.runProxy();

        BehavioralPatternsRunners.runIterator();
        BehavioralPatternsRunners.runTemplateMethod();
        BehavioralPatternsRunners.runCommand();
        BehavioralPatternsRunners.runMediator();
        BehavioralPatternsRunners.runObserver();
        BehavioralPatternsRunners.runStrategy();
        BehavioralPatternsRunners.runChainOfResponsibility();
        BehavioralPatternsRunners.runInterpreter();
        BehavioralPatternsRunners.runMemento();
        BehavioralPatternsRunners.runState();
        BehavioralPatternsRunners.runVisitor();
    }
}