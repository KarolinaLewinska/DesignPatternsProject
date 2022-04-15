package com.java.designpatternsproject.structural.bridge;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class HtmlDocumentManager extends DocumentManager {
    private HTMLDocument htmlDocument;

    public HtmlDocumentManager() {
        this.htmlDocument = new HTMLDocument();
    }

    @Override
    public void addText(String text) {
        try {
            HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
            htmlEditorKit.insertHTML(htmlDocument, htmlDocument.getLength(), "<p>" + text + "</p>", 0, 0, null);
            System.out.println("Added text: " + htmlDocument.getText(0,htmlDocument.getLength()) + " to HTML document\n");
        }  catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public String removeHTMLTags(HTMLDocument htmlDocument) throws Exception {
        try {
            String allDocumentText = htmlDocument.getText(0, htmlDocument.getLength());
            return allDocumentText.replaceAll("\\<.*?\\>", "");
        } catch (Exception exc) {
            exc.printStackTrace();
            throw new Exception("Exception occurred during removing HTML tags from document");
        }
    }
}