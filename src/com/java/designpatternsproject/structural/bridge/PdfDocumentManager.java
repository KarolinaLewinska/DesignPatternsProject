package com.java.designpatternsproject.structural.bridge;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;

import java.nio.file.Path;

public class PdfDocumentManager extends DocumentManager {
    private Document pdfDocument;

    public PdfDocumentManager() {
        this.pdfDocument = new Document();
    }

    @Override
    public void addText(String text) {
        try {
            pdfDocument.open();
            Chunk textChunk = new Chunk(text);
            pdfDocument.add(textChunk);
            pdfDocument.close();
            System.out.println("Added text:\n" + textChunk + " to PDF document\n");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void addImage(Path pathToImage) {
        try {
            pdfDocument.open();
            Image imgToAdd = Image.getInstance(pathToImage.toAbsolutePath().toString());
            pdfDocument.add(imgToAdd);
            pdfDocument.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}