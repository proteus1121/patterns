package org.proteus1121.structure.decorator;

class SimpleText implements Text {
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}