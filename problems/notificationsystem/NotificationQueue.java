package problems.notificationsystem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NotificationQueue {

    private BlockingQueue<Notification> queue = new LinkedBlockingQueue<>();

    public void enqueue(Notification notification) throws InterruptedException {
        queue.put(notification);

        System.out.println(
                "[QUEUE] Added: "
                + notification.getClass().getSimpleName()
        );

    }

    public Notification dequeue() throws InterruptedException {
        return queue.take();

    }
}
