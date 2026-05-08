package problems.notificationsystem;

public class Main {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification emailNotification = notificationFactory.create(NotificationType.EMAIL);

        try {
            // Fixed Delay Strategy 
            RetryConfig retryConfig = new RetryConfig(10);

            // Fixed Delay Strategy
            // RetryStrategy strategy = new FixedDelayStrategy(1000);
            // ExponentialBackoffStrategy strategy
            RetryStrategy strategy = new ExponentialBackoffStrategy(1000);

            RetryService retryService = new RetryService(retryConfig, strategy);
            NotificationQueue queue = new NotificationQueue();

            // Producer
            NotificationProducer producer = new NotificationProducer(queue);
            Thread producerThread = new Thread(producer);
            producerThread.setName("producer-thread");

            producerThread.start();

            // Consumer
            NotificationWorker worker = new NotificationWorker(queue, retryService);
            Thread workerThread = new Thread(worker);
            workerThread.setName("notification-worker");

            workerThread.start();

        } catch (Exception e) {
            System.out.println("Exception while retrying email notification");
        }
    }
}
