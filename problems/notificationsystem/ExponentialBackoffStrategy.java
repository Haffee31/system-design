package problems.notificationsystem;

public class ExponentialBackoffStrategy implements RetryStrategy {

    private long baseDelay;

    public ExponentialBackoffStrategy(long baseDelay) {
        this.baseDelay = baseDelay;
    }

    @Override
    public long getDelay(int attempt) {
        return (long) (baseDelay * Math.pow(2, attempt - 1));
    }

}
