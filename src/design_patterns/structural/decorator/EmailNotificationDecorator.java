package design_patterns.structural.decorator;

public class EmailNotificationDecorator extends NotificationDecorator {
    public EmailNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        wrappedNotification.send();
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending notification via Email");
    }
}
