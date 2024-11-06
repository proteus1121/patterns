package org.proteus1121.behavioral.visitor.element;

import org.proteus1121.behavioral.visitor.DocumentVisitor;

// Интерфейс элемента, принимающего посетителя
public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}