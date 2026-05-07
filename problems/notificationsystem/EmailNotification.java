package problems.notificationsystem;

public class EmailNotification implements Notification {

    public EmailNotification() {
    }

    @Override
    public void send(String message) throws Exception {

        // Introducing Failure Simulation
        System.out.println("Message sending via Email Notification: " + message);

        if (Math.random() < 0.7) {
            throw new Exception("Email service failed");
        }

        System.out.println("Email sent successfully. " + message);

    }
}
