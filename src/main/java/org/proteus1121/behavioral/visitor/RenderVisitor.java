package org.proteus1121.behavioral.visitor;

import org.proteus1121.behavioral.visitor.element.ImageElement;
import org.proteus1121.behavioral.visitor.element.TableElement;
import org.proteus1121.behavioral.visitor.element.TextElement;

class RenderVisitor implements DocumentVisitor {
    @Override
    public void visit(TextElement textElement) {
        System.out.println("Rendering text: " + textElement.getText());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Rendering image from path: " + imageElement.getImagePath());
    }

    @Override
    public void visit(TableElement tableElement) {
        System.out.println("Rendering table:");
        for (String[] row : tableElement.getData()) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}