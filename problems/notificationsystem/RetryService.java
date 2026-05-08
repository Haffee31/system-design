package problems.notificationsystem;

class RetryService {

    private final int maxRetries;

    public RetryService(RetryConfig retryConfig) {
        this.maxRetries = retryConfig.getMaxRetries();
    }

    public void execute(Notification notification) {

        for (int attempt = 1; attempt <= this.maxRetries; attempt++) {
            try {
                notification.send("Notification from Retry Service");

                System.out.println("Success");
                return;

            } catch (Exception e) {
                System.out.println(
                        "Attempt " + attempt + " failed"
                );

                try {
                    System.out.println("waiting for 10000ms before retry");
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        System.out.println("All retries failed");

    }
}
