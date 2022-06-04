package com.java.designpatternsproject.patternsrunners;

import com.java.designpatternsproject.behavioral.chainOfResponsibility.CoffeMachine;
import com.java.designpatternsproject.behavioral.command.CopyImageCommand;
import com.java.designpatternsproject.behavioral.command.CreateGraphicsCommand;
import com.java.designpatternsproject.behavioral.command.ImageCommandExecutor;
import com.java.designpatternsproject.behavioral.command.RotateImageCommand;
import com.java.designpatternsproject.behavioral.interpreter.CamelCasePattern;
import com.java.designpatternsproject.behavioral.interpreter.PascalCasePattern;
import com.java.designpatternsproject.behavioral.interpreter.SnakeCasePattern;
import com.java.designpatternsproject.behavioral.iterator.EmployeeCollection;
import com.java.designpatternsproject.behavioral.iterator.Iterator;
import com.java.designpatternsproject.behavioral.iterator.RegularCustomerCollection;
import com.java.designpatternsproject.behavioral.mediator.Client;
import com.java.designpatternsproject.behavioral.mediator.LoyalClubClient;
import com.java.designpatternsproject.behavioral.mediator.Mediator;
import com.java.designpatternsproject.behavioral.mediator.OrdinaryClient;
import com.java.designpatternsproject.behavioral.mediator.Receipt;
import com.java.designpatternsproject.behavioral.mediator.ShopMediator;
import com.java.designpatternsproject.behavioral.memento.Product;
import com.java.designpatternsproject.behavioral.observer.AppleObserver;
import com.java.designpatternsproject.behavioral.observer.MusicPlayer;
import com.java.designpatternsproject.behavioral.observer.SonyObserver;
import com.java.designpatternsproject.behavioral.state.Order;
import com.java.designpatternsproject.behavioral.strategy.RectorScholarship;
import com.java.designpatternsproject.behavioral.strategy.Scholarship;
import com.java.designpatternsproject.behavioral.strategy.SocialScholarship;
import com.java.designpatternsproject.behavioral.strategy.Student;
import com.java.designpatternsproject.behavioral.templatemethod.AccountManager;
import com.java.designpatternsproject.behavioral.templatemethod.DollarAccount;
import com.java.designpatternsproject.behavioral.templatemethod.EuroAccount;
import com.java.designpatternsproject.behavioral.visitor.Visitor;
import com.java.designpatternsproject.behavioral.visitor.ElementVisitor;
import com.java.designpatternsproject.behavioral.visitor.Order;
import com.java.designpatternsproject.behavioral.visitor.Phone;
import com.java.designpatternsproject.behavioral.visitor.Charger;
import com.java.designpatternsproject.behavioral.visitor.Earphones;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BehavioralPatternsRunners {
    public static void runIterator() {
        Iterator employeeIterator;
        Iterator customerIterator;

        EmployeeCollection employeeCollection = new EmployeeCollection();
        employeeCollection.setEmployee("Jan Kowalski");
        employeeCollection.setEmployee("Anna Nowak");

        RegularCustomerCollection customerCollection = new RegularCustomerCollection();
        customerCollection.setCustomer("Karolina Lewińska");
        customerCollection.setCustomer("Aleksandra Okrój");

        for (employeeIterator = employeeCollection.createIterator(); employeeIterator.hasNext();) {
            Object nextEmployee = employeeIterator.getNext();
            System.out.println("Employee: " + nextEmployee);
        }

        for (customerIterator = customerCollection.createIterator(); customerIterator.hasNext();) {
            Object nextCustomer = customerIterator.getNext();
            System.out.println("Regular customer: " + nextCustomer);
        }
    }

    public static void runTemplateMethod() {
        AccountManager euroAccount = new EuroAccount("Karolina Lewińska",
                "22 1034 4204 1421 0214 8976 0987", 15516.92, 20000, 150);
        AccountManager dollarAccount = new DollarAccount("Aleksandra Okrój",
                "11 1534 0544 0943 0000 8326 5917", 90251.12, 10000, 50);
        euroAccount.processAccountMethods();
        dollarAccount.processAccountMethods();
    }

    public static void runCommand() {
        ImageCommandExecutor executor = new ImageCommandExecutor();
        try {
            BufferedImage image = ImageIO.read(new File("src/com/java/designpatternsproject/creational/prototype/owl.jpeg"));
            executor.executeImageCommands(new CopyImageCommand(image));
            executor.executeImageCommands(new CreateGraphicsCommand(image));
            executor.executeImageCommands(new RotateImageCommand(image));
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public static void runMediator() {
        List<String> products = new ArrayList<>();
        products.add("Iphone 7");
        products.add("Iphone 8");
        Mediator mediator = new ShopMediator();
        Client loyalClubClient = new LoyalClubClient(mediator, "Anna Kowalska", "akowalska12@wp.pl",
                "Polna 12 Gdańsk", new Receipt(products, new BigDecimal(9250)));
        Client ordinaryClient = new OrdinaryClient(mediator, "Jan Nowak", "nowak99gmail.com",
                "Kwiatowa 1 Gdynia", new Receipt(products, new BigDecimal(9250)));
        mediator.addClient(loyalClubClient);
        mediator.addClient(ordinaryClient);
        mediator.sendReceipt(loyalClubClient);
        mediator.sendReceipt(ordinaryClient);
    }

    public static void runObserver() {
        MusicPlayer musicPlayer = new MusicPlayer();
        new SonyObserver(musicPlayer);
        new AppleObserver(musicPlayer);
        musicPlayer.setCurrentSongTitle("Song 2");
        musicPlayer.setCurrentSongTitle("Song 3");
    }

    public static void runStrategy() {
        Student student = new Student("291435", "Jan Kowalski", 4.75, 2000);
        Student student2 = new Student("123456", "Anna Kruk", 4.50, 1000);

        Scholarship rectorScholarship = new RectorScholarship();
        rectorScholarship.grandScholarship(student);
        rectorScholarship.grandScholarship(student2);

        Scholarship socialScholarship = new SocialScholarship();
        socialScholarship.grandScholarship(student);
        socialScholarship.grandScholarship(student2);

        RectorScholarship.rectorScholarshipStudents.forEach(s -> System.out.println(s.getNameAndSurname()));
        SocialScholarship.socialScholarshipStudents.forEach(s -> System.out.println(s.getNameAndSurname()));
    }

    public static void runChainOfResponsibility(){
        int price = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your coffe and enter the money: ");
        System.out.println("Espresso: 5PLN");
        System.out.println("Cappuccino: 8PLN");
        System.out.println("Latte Macchiato: 10PLN");
        System.out.println("I choose: ");
        String coffe = scanner.nextLine();
        switch(coffe){
            case "Espresso":
                price = 5;
                break;
            case "Cappuccino":
                price = 8;
                break;
            case "Latte Macchiato":
                price = 10;
                break;
            default:
                System.out.println("This type of coffe is not available right now!");
                return;
        }
        System.out.println("The amount of money I put in: ");
        int handedMoney = scanner.nextInt();
        while(handedMoney<price){
            System.out.println("That is not enough! Put in more");
            int additionalMoney = scanner.nextInt();
            handedMoney += additionalMoney;
        }
        int change = handedMoney - price;
        CoffeMachine.giveChange(change);
    }

    public static void runInterpreter(){
        String expression = "This is an example of interpreter pattern";

        CamelCasePattern camelCaseInterpreter = new CamelCasePattern();
        PascalCasePattern pascalCaseInterpreter = new PascalCasePattern();
        SnakeCasePattern snakeCaseInterpreter = new SnakeCasePattern();

        String camelCase = camelCaseInterpreter.conversion(expression);
        String PascalCase = pascalCaseInterpreter.conversion(expression);
        String snake_case = snakeCaseInterpreter.conversion(expression);

        System.out.println("Expression in camel case: " + camelCase);
        System.out.println("Expression in pascal case: " + PascalCase);
        System.out.println("Expression in snake case: " + snake_case);
    }

    public static void runMemento(){
        Product product = new Product("Product1");

        product.add();
        product.add();
        product.saveProduct();
        product.remove();
        product.undoChanges();
    }

    public static void runState(){
        Order newOrder = new Order();

        newOrder.showOrderStatus();
        newOrder.nextState();
        newOrder.showOrderStatus();
        newOrder.nextState();
        newOrder.showOrderStatus();
        newOrder.nextState();
        newOrder.showOrderStatus();
        newOrder.nextState();
    }

    public static void runVisitor(){
        Visitor visitor = new ElementVisitor();

        Order order = new Order();
        order.addToOrder(new Phone());
        order.addToOrder(new Charger());
        order.addToOrder(new Earphones());

        order.accept(visitor);
    }
}