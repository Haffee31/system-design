package problems.notificationsystem;

public class Main {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification emailNotification = notificationFactory.create(NotificationType.EMAIL);
        emailNotification.send("Hello there!");
    }
}
