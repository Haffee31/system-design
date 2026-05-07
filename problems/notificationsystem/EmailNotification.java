package problems.notificationsystem;

public class EmailNotification implements Notification {

    public EmailNotification() {
    }

    public void send(String message) {
        System.out.println("Message sent via Email Notification: " + message);
    }
}
