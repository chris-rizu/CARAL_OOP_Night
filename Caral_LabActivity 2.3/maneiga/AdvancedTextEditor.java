package maneiga;

import java.util.Stack;

public class AdvancedTextEditor extends TextEditor {
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        undoStack.push(initialText);
    }

    @Override
    public void append(String newText) {
        super.append(newText);
        undoStack.push(getText());
        redoStack.clear();  // Clear redo history after a new operation
    }

    @Override
    public void delete(int n) {
        super.delete(n);
        undoStack.push(getText());
        redoStack.clear();  // Clear redo history after a new operation
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(getText());
            setText(undoStack.pop());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(getText());
            setText(redoStack.pop());
        }
    }
}