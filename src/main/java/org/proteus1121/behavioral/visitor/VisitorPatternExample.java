package org.proteus1121.behavioral.visitor;

import org.proteus1121.behavioral.visitor.element.DocumentElement;
import org.proteus1121.behavioral.visitor.element.ImageElement;
import org.proteus1121.behavioral.visitor.element.TableElement;
import org.proteus1121.behavioral.visitor.element.TextElement;

public class VisitorPatternExample {
    public static void main(String[] args) {
        DocumentElement[] elements = {
                new TextElement("Hello, world!"),
                new ImageElement("/path/to/image.jpg"),
                new TableElement(new String[][] { {"Name", "Age"}, {"Alice", "30"}, {"Bob", "25"} })
        };

        DocumentVisitor renderVisitor = new RenderVisitor();

        // Применяем посетителя ко всем элементам
        for (DocumentElement element : elements) {
            element.accept(renderVisitor);
        }
    }
}
