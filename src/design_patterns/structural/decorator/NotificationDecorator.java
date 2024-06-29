package design_patterns.structural.decorator;

public abstract class NotificationDecorator implements Notification {
    protected Notification wrappedNotification;

    public NotificationDecorator(Notification notification) {
        this.wrappedNotification = notification;
    }

    @Override
    public void send() {
        wrappedNotification.send();
    }
}
