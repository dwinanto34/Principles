package design_patterns.structural.decorator;

public class BasicNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending basic notification");
    }
}
