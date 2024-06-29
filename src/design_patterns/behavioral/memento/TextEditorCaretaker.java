package design_patterns.behavioral.memento;

import java.util.Stack;

public class TextEditorCaretaker {
    private Stack<Memento> history = new Stack<>();

    public void save(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            textEditor.restore(history.pop());
        } else {
            System.out.println("Cannot undo");
        }
    }
}
