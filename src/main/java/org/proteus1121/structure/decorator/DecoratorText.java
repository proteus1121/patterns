package org.proteus1121.structure.decorator;

abstract class DecoratorText implements Text {
    protected Text decoratedText;

    public DecoratorText(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    public String getText() {
        return decoratedText.getText();
    }
}