package org.proteus1121.behavioral.visitor;

import org.proteus1121.behavioral.visitor.element.ImageElement;
import org.proteus1121.behavioral.visitor.element.TableElement;
import org.proteus1121.behavioral.visitor.element.TextElement;

// Интерфейс посетителя, который описывает действия для разных типов элементов
public interface DocumentVisitor {
    void visit(TextElement textElement);
    void visit(ImageElement imageElement);
    void visit(TableElement tableElement);
}