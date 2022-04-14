package com.java.designpatternsproject.structural.bridge;

public abstract class PrimeDocument {
    public String fileName;
    public String extension;
    DocumentManager documentManager;

    public PrimeDocument(DocumentManager documentManager) {
        this.documentManager = documentManager;
    }

    public abstract void addTextToFile(String text);

    public String getFileName() {
        return fileName;
    }

    public String getExtension() {
        return extension;
    }
}