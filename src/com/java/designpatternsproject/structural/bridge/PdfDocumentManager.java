package com.java.designpatternsproject.structural.bridge;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Path;

public class PdfDocumentManager extends DocumentManager {
    Document pdfDocument;

    public PdfDocumentManager() {
        this.pdfDocument = new Document();
    }

    @Override
    public void addText(String text) {
        try {
            pdfDocument.open();
            Font font = FontFactory.getFont(FontFactory.HELVETICA, 12, Color.BLACK);
            Chunk textChunk = new Chunk(text, font);
            pdfDocument.add(textChunk);
            pdfDocument.close();
            System.out.println("Added text: " + textChunk + " to pdf document");
        } catch (DocumentException e) {
            throw new RuntimeException("Exception occurred during adding text to pdf document");
        }
    }

    public void addImage(Path pathToImage) {
        try {
            pdfDocument.open();
            Image imgToAdd = Image.getInstance(pathToImage.toAbsolutePath().toString());
            pdfDocument.add(imgToAdd);
            pdfDocument.close();
        } catch (DocumentException | IOException exc) {
            throw new RuntimeException("Exception occurred during adding image to pdf document");
        }
    }
}