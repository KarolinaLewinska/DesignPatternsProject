package com.java.designpatternsproject.structural.bridge;

import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.io.IOException;

public class HtmlDocumentManager extends DocumentManager {
    HTMLDocument htmlDocument = new HTMLDocument();

    @Override
    public void addText(String text) {
        try {
            HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
            htmlEditorKit.insertHTML(htmlDocument, htmlDocument.getLength(), "<p>" + text + "</p>", 0, 0, null);
            System.out.println("Added text: " + htmlDocument.getText(0,htmlDocument.getLength()) + " to html document");
        }  catch (IOException | BadLocationException e) {
            throw new RuntimeException("Exception occurred during adding text to html document");
        }
    }

    public String removeHTMLTags(HTMLDocument htmlDocument)  {
        try {
            String allDocumentText = htmlDocument.getText(0, htmlDocument.getLength());
            return allDocumentText.replaceAll("\\<.*?\\>", "");
        } catch (BadLocationException exc) {
            throw new RuntimeException("Exception occurred during removing html tags from document");
        }
    }
}