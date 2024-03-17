/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maneiga;

public class TextEditor {
    private String text;

    public TextEditor(String initialText) {
        this.text = initialText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void append(String newText) {
        text += newText;
    }

    public void delete(int n) {
        if (n > text.length()) {
            return;
        }
        text = text.substring(0, text.length() - n);
    }
}