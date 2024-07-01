package design_patterns.behavioral.visitor.document;

import design_patterns.behavioral.visitor.DocumentVisitor;

public class Table implements DocumentElement {
    private String[][] data;

    public Table(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
