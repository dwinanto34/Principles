package design_patterns.structural.decorator;

public class SMSNotificationDecorator extends NotificationDecorator {
    public SMSNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        wrappedNotification.send();
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("Sending notification via SMS");
    }
}
