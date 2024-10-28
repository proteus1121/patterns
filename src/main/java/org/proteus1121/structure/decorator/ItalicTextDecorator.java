package org.proteus1121.structure.decorator;

class ItalicTextDecorator extends DecoratorText {
    public ItalicTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getText() {
        return "<i>" + decoratedText.getText() + "</i>";
    }
}