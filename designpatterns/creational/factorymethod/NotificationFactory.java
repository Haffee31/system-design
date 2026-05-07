package designpatterns.creational.factorymethod;

interface Notification {

    void send(String message);
}

enum NotificationType {
    SMS,
    EMAIL,
}

class SMSNotification implements Notification {

    public void send(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

class EmailNotification implements Notification {

    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}

// Factory
class NotificationFactory {

    public static Notification create(NotificationType type) {
        if (type == NotificationType.SMS) {
            return new SMSNotification();
        } else if (type == NotificationType.EMAIL) {
            return new EmailNotification();
        }

        throw new IllegalArgumentException("Unknown type");
    }
}
