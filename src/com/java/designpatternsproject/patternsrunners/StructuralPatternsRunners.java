package com.java.designpatternsproject.patternsrunners;

import com.java.designpatternsproject.structural.adapter.NumbersAdapter;
import com.java.designpatternsproject.structural.adapter.Number;
import com.java.designpatternsproject.structural.adapter.BinaryValue;
import com.java.designpatternsproject.structural.bridge.HtmlDocument;
import com.java.designpatternsproject.structural.bridge.HtmlDocumentManager;
import com.java.designpatternsproject.structural.bridge.DocumentManager;
import com.java.designpatternsproject.structural.bridge.PdfDocument;
import com.java.designpatternsproject.structural.bridge.PdfDocumentManager;
import com.java.designpatternsproject.structural.bridge.PrimeDocument;

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
}