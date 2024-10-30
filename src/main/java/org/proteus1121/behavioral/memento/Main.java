package org.proteus1121.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextHistory history = new TextHistory();

        editor.write("Hello, ");
        history.save(editor);

        editor.write("world!");
        history.save(editor);

        System.out.println("Current text: " + editor.getText());

        System.out.println("Undoing last action:");
        history.undo(editor);
        System.out.println("Current text: " + editor.getText());

        System.out.println("Undoing another action:");
        history.undo(editor);
        System.out.println("Current text: " + editor.getText());
    }
}