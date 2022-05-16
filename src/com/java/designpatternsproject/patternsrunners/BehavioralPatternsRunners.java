package com.java.designpatternsproject.patternsrunners;

import com.java.designpatternsproject.behavioral.command.CopyImageCommand;
import com.java.designpatternsproject.behavioral.command.CreateGraphicsCommand;
import com.java.designpatternsproject.behavioral.command.ImageCommandExecutor;
import com.java.designpatternsproject.behavioral.command.RotateImageCommand;
import com.java.designpatternsproject.behavioral.iterator.EmployeeCollection;
import com.java.designpatternsproject.behavioral.iterator.Iterator;
import com.java.designpatternsproject.behavioral.iterator.RegularCustomerCollection;
import com.java.designpatternsproject.behavioral.mediator.Client;
import com.java.designpatternsproject.behavioral.mediator.LoyalClubClient;
import com.java.designpatternsproject.behavioral.mediator.Mediator;
import com.java.designpatternsproject.behavioral.mediator.OrdinaryClient;
import com.java.designpatternsproject.behavioral.mediator.Receipt;
import com.java.designpatternsproject.behavioral.mediator.ShopMediator;
import com.java.designpatternsproject.behavioral.observer.AppleObserver;
import com.java.designpatternsproject.behavioral.observer.MusicPlayer;
import com.java.designpatternsproject.behavioral.observer.SonyObserver;
import com.java.designpatternsproject.behavioral.strategy.RectorScholarship;
import com.java.designpatternsproject.behavioral.strategy.Scholarship;
import com.java.designpatternsproject.behavioral.strategy.SocialScholarship;
import com.java.designpatternsproject.behavioral.strategy.Student;
import com.java.designpatternsproject.behavioral.templatemethod.AccountManager;
import com.java.designpatternsproject.behavioral.templatemethod.DollarAccount;
import com.java.designpatternsproject.behavioral.templatemethod.EuroAccount;

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
}