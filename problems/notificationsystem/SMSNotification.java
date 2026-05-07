package problems.notificationsystem;

public class SMSNotification implements Notification {

    public SMSNotification() {
    }

    public void send(String message) {
        System.out.println("Message sent via SMS Notification: " + message);
    }
}
