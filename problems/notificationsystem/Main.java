package problems.notificationsystem;

public class Main {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification emailNotification = notificationFactory.create(NotificationType.EMAIL);

        try {
            RetryConfig retryConfig = new RetryConfig(10);

            RetryService retryService = new RetryService(retryConfig);
            retryService.execute(emailNotification);

        } catch (Exception e) {
            System.out.println("Exception while retrying email notification");
        }
        // emailNotification.send("Hello there!");
    }
}
