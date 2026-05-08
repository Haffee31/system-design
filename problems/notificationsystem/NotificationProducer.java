package problems.notificationsystem;

class NotificationProducer implements Runnable {

    private NotificationQueue queue;

    public NotificationProducer(NotificationQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {

            try {

                queue.enqueue(
                        new EmailNotification()
                );

                System.out.println(
                        "[PRODUCER] pushed new email notification"
                );

                Thread.sleep(3000);

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

}
