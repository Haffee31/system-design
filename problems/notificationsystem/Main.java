package problems.notificationsystem;

public class Main {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification emailNotification = notificationFactory.create(NotificationType.EMAIL);

        try {
            RetryService retryService = new RetryService();
            retryService.execute(emailNotification);

        } catch (Exception e) {
            System.out.println("Exception while retrying email notification");
        }
        // emailNotification.send("Hello there!");
    }
}
