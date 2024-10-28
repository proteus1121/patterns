package org.proteus1121.structure.decorator;

class BoldTextDecorator extends DecoratorText {
    public BoldTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getText() {
        return "<b>" + decoratedText.getText() + "</b>";
    }
}
