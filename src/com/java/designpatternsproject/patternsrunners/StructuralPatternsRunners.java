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
}