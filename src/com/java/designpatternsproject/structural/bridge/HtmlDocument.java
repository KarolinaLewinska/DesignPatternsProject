package com.java.designpatternsproject.structural.bridge;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.io.Reader;
import java.io.StringReader;

public class HtmlDocument extends PrimeDocument {
    public HtmlDocument(String fileName, DocumentManager documentManager) {
        super(documentManager);
        try {
            createHTMLDocument(fileName);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public void addTextToFile(String text) {
        documentManager.addText(text);
    }

    private HTMLDocument createHTMLDocument(String fileName) throws Exception {
       setDocumentFields(fileName);

        try {
            String htmlStructure = "<html> \n" +
                    "<head> \n" +
                    "<title>" + fileName + "</title> \n" +
                    "</head> \n" +
                    "<body> \n" +
                    "</body> \n" +
                    "</html> ";
            Reader stringReader = new StringReader(htmlStructure);
            HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
            HTMLDocument htmlDocument = (HTMLDocument) htmlEditorKit.createDefaultDocument();
            htmlEditorKit.read(stringReader, htmlDocument, 0);
            return htmlDocument;
        } catch (Exception exc) {
            exc.printStackTrace();
            throw new Exception("Exception occurred during creating html document");
        }
    }

    private void setDocumentFields(String fileName) {
        this.fileName = fileName;
        this.extension = ".html";
    }
}