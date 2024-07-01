package design_patterns.behavioral.visitor.document;

import design_patterns.behavioral.visitor.DocumentVisitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
