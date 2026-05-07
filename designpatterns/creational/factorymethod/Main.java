package designpatterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.create(NotificationType.EMAIL);
        notification.send("A test Alert for System Designing!!!");
    }
}
