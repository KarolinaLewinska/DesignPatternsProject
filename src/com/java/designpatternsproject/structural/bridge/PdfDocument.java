package com.java.designpatternsproject.structural.bridge;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfDocument extends PrimeDocument {
    public PdfDocument(String fileName, DocumentManager documentManager) {
        super(documentManager);
        createPDFDocument(fileName);
    }

    @Override
    public void addTextToFile(String text) {
        documentManager.addText(text);
    }

    private Document createPDFDocument(String fileName)  {
        setDocumentFields(fileName);
        try {
            Document pdfDoc = new Document();
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(fileName + extension));
            return pdfDoc;
        } catch (FileNotFoundException | DocumentException exc ) {
            throw new RuntimeException("Exception occurred during creating pdf document");
        }
    }

    private void setDocumentFields(String fileName) {
        this.fileName = fileName;
        this.extension = ".pdf";
    }
}