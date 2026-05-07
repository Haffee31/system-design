package problems.notificationsystem;

class RetryConfig {

    private final int maxRetries;

    public RetryConfig(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public int getMaxRetries() {
        return this.maxRetries;
    }

}
