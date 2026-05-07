package problems.notificationsystem;

public class NotificationFactory {

    public NotificationFactory() {

    }

    Notification create(NotificationType type) {
        if (type == NotificationType.EMAIL) {
            return new EmailNotification();
        } else if (type == NotificationType.SMS) {
            return new SMSNotification();
        }

        throw new IllegalArgumentException("Unknown Notification Type");

    }
}
