package design_patterns.structural.flyweight;

public class ConcreteFont implements Font {
    private String name;

    public ConcreteFont(String name) {
        this.name = name;

        try {
            // Simulate heavy object creation time
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(String text) {
        System.out.println("Rendering text '" + text + "' in font: " + name);
    }
}
