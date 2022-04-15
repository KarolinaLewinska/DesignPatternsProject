package com.java.designpatternsproject.structural.bridge;

import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;

import java.io.FileOutputStream;

public class PdfDocument extends PrimeDocument {
    public PdfDocument(String fileName, DocumentManager documentManager) {
        super(documentManager);
        try {
            createPDFDocument(fileName);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public void addTextToFile(String text) {
        documentManager.addText(text);
    }

    private Document createPDFDocument(String fileName) throws Exception {
        setDocumentFields(fileName);
        try {
            Document pdfDoc = new Document();
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(fileName + extension));
            return pdfDoc;
        } catch (Exception exc) {
            exc.printStackTrace();
            throw new Exception("Exception occurred during creating PDF document");
        }
    }

    private void setDocumentFields(String fileName) {
        this.fileName = fileName;
        this.extension = ".pdf";
    }
}