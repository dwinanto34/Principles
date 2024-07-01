package design_patterns.behavioral.visitor;

import design_patterns.behavioral.visitor.document.Image;
import design_patterns.behavioral.visitor.document.Paragraph;
import design_patterns.behavioral.visitor.document.Table;

public class ExportVisitor implements DocumentVisitor {

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Exporting Paragraph: " + paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Exporting Image: " + image.getImagePath());
    }

    @Override
    public void visit(Table table) {
        System.out.println("Exporting Table:");
        for (String[] row : table.getData()) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
