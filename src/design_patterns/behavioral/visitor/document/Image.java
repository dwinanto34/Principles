package design_patterns.behavioral.visitor.document;

import design_patterns.behavioral.visitor.DocumentVisitor;

public class Image implements DocumentElement {
    private String imagePath;

    public Image(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
