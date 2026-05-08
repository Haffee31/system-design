package problems.notificationsystem;

class NotificationWorker implements Runnable {

    private NotificationQueue queue;
    private RetryService retryService;

    public NotificationWorker(NotificationQueue queue, RetryService retryService) {
        this.queue = queue;
        this.retryService = retryService;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Notification notification = queue.dequeue();

                System.out.println(
                        "[WORKER] Processing: "
                        + notification.getClass().getSimpleName()
                );

                retryService.execute(notification);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
