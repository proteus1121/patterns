package org.proteus1121.behavioral.visitor.element;

import org.proteus1121.behavioral.visitor.DocumentVisitor;

public class TextElement implements DocumentElement {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}