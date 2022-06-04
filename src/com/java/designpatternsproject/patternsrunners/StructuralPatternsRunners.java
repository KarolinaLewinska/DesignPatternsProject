package com.java.designpatternsproject.patternsrunners;

import com.java.designpatternsproject.structural.adapter.BinaryValue;
import com.java.designpatternsproject.structural.adapter.NumbersAdapter;
import com.java.designpatternsproject.structural.adapter.Number;
import com.java.designpatternsproject.structural.bridge.HtmlDocument;
import com.java.designpatternsproject.structural.bridge.HtmlDocumentManager;
import com.java.designpatternsproject.structural.bridge.DocumentManager;
import com.java.designpatternsproject.structural.bridge.PdfDocument;
import com.java.designpatternsproject.structural.bridge.PdfDocumentManager;
import com.java.designpatternsproject.structural.bridge.PrimeDocument;
import com.java.designpatternsproject.structural.composite.Card;
import com.java.designpatternsproject.structural.composite.ChristmasCard;
import com.java.designpatternsproject.structural.composite.EmployeeCard;
import com.java.designpatternsproject.structural.composite.GiftCard;
import com.java.designpatternsproject.structural.composite.ShoppingCard;
import com.java.designpatternsproject.structural.decorator.ManagerCandidate;
import com.java.designpatternsproject.structural.decorator.InternCandidate;
import com.java.designpatternsproject.structural.decorator.Eligible;
import com.java.designpatternsproject.structural.facade.CouponApplier;
import com.java.designpatternsproject.structural.facade.Client;
import com.java.designpatternsproject.structural.flyweight.ParticleFactory;
import com.java.designpatternsproject.structural.proxy.Proxy;

import java.math.BigDecimal;

public class StructuralPatternsRunners {
    public static void runAdapter() {
        BinaryValue binaryValue = new NumbersAdapter(new Number(1010463435));
        binaryValue.printInfo();
    }

    public static void runBridge() {
        DocumentManager documentHtmlManager = new HtmlDocumentManager();
        PrimeDocument htmlDocument = new HtmlDocument("website.html", documentHtmlManager);
        htmlDocument.addTextToFile("Lorem ipsum dolor sit amet");

        DocumentManager documentPdfManager = new PdfDocumentManager();
        PrimeDocument pdfDocument = new PdfDocument("document.pdf", documentPdfManager);
        pdfDocument.addTextToFile("Lorem ipsum dolor sit amet");
    }

    public static void runComposite() {
        Card christmasCard = new ChristmasCard(new BigDecimal("50"));
        Card giftCard = new GiftCard(new BigDecimal("150"));
        Card employeeCard = new EmployeeCard(new BigDecimal("200"));

        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.addCardToList(christmasCard);
        shoppingCard.addCardToList(giftCard);
        shoppingCard.addCardToList(employeeCard);
        shoppingCard.printCardData();
        shoppingCard.removeCardFromList(christmasCard);
        shoppingCard.removeCardFromList(giftCard);
        shoppingCard.printCardData();
    }

    public static void runDecorator(){
        ManagerCandidate candidate1 = new ManagerCandidate("Jane", "Austin", 32, 10);
        InternCandidate candidate2 = new InternCandidate("John", "Doe", 21, "Computer Science", 2);

        candidate1.showCandidate();
        candidate2.showCandidate();

        Eligible hiredCandidate = new Eligible(candidate1);
        hiredCandidate.hire();
        hiredCandidate.showCandidate();
    }

    public static void runFacade(){
        CouponApplier couponApplier = new CouponApplier();
        Client client = new Client("Annx");

        boolean canCouponBeApplied = couponApplier.canCouponBeApplied(client,3,350,550);

        System.out.println(canCouponBeApplied ? "Coupon for -20% off was applied!" : "The coupon is not available");
    }

    public static void runFlyweight(){
        int[] coordinatesX = new int[]{15, 4, 63, 22};
        int[] coordinatesY = new int[]{13, -1, 2, 64};
        int size = 1;

        ParticleFactory factory = new ParticleFactory(coordinatesX, coordinatesY, size);

        for(int i = 0; i<coordinatesX.length; i++){
            if(coordinatesY.length < i) break;
            factory.getParticle(coordinatesX[i], coordinatesY[i]).createParticle();
        }

        System.out.println("Default size particles: ");

        ParticleFactory factoryWithDefaultSizeParticles = new ParticleFactory(coordinatesX, coordinatesY);
        for(int i = 0; i<coordinatesX.length; i++){
            if(coordinatesY.length< i) break;
            factoryWithDefaultSizeParticles.getParticle(coordinatesX[i], coordinatesY[i]).createParticle();
        }
    }

    public static void runProxy(){
        Proxy proxy1 = new Proxy(11);
        Proxy proxy2 = new Proxy(17);

        proxy1.WatchMovie();
        proxy2.WatchMovie();
    }
}