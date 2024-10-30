package org.proteus1121.behavioral.memento;

class TextEditor {
    private String text = "";

    public void write(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    // Создание Memento для сохранения текущего состояния текста
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Восстановление состояния из Memento
    public void restore(TextMemento memento) {
        text = memento.getText();
    }
}
