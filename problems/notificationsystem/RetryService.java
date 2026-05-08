package problems.notificationsystem;

class RetryService {

    private RetryConfig retryConfig;
    private RetryStrategy retryStrategy;

    public RetryService(RetryConfig retryConfig, RetryStrategy retryStrategy) {
        this.retryConfig = retryConfig;
        this.retryStrategy = retryStrategy;
    }

    public void execute(Notification notification) {

        for (int attempt = 1; attempt <= retryConfig.getMaxRetries(); attempt++) {
            try {
                notification.send("Notification from Retry Service");

                System.out.println("Success");
                return;

            } catch (Exception e) {
                System.out.println(
                        "Attempt " + attempt + " failed"
                );

                try {

                    long delay = retryStrategy.getDelay(attempt);

                    System.out.println("waiting for " + delay + "ms before retry");
                    Thread.sleep(delay);

                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        System.out.println("All retries failed");

    }
}
