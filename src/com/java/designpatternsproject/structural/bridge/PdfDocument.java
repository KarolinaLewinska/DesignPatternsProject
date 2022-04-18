package com.java.designpatternsproject.structural.bridge;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;

import java.io.FileOutputStream;
import java.io.IOException;

public class PdfDocument extends PrimeDocument {
    public PdfDocument(String fileName, DocumentManager documentManager) {
        super(documentManager);
        try {
            createPDFDocument(fileName);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public void addTextToFile(String text) {
        documentManager.addText(text);
    }

    private Document createPDFDocument(String fileName) throws IOException {
        setDocumentFields(fileName);
        try {
            Document pdfDoc = new Document();
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(fileName + extension));
            return pdfDoc;
        } catch (IOException | DocumentException exc) {
            exc.printStackTrace();
            throw new IOException("Exception occurred during creating PDF document");
        }
    }

    private void setDocumentFields(String fileName) {
        this.fileName = fileName;
        this.extension = ".pdf";
    }
}