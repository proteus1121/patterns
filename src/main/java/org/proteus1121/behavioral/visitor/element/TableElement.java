package org.proteus1121.behavioral.visitor.element;

import org.proteus1121.behavioral.visitor.DocumentVisitor;

public class TableElement implements DocumentElement {
    private String[][] data;

    public TableElement(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}