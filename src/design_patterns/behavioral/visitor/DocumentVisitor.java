package design_patterns.behavioral.visitor;

import design_patterns.behavioral.visitor.document.Image;
import design_patterns.behavioral.visitor.document.Paragraph;
import design_patterns.behavioral.visitor.document.Table;

public interface DocumentVisitor {
    void visit(Paragraph paragraph);
    void visit(Image image);
    void visit(Table table);
}
