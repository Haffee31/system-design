package problems.notificationsystem;

class FixedDelayStrategy implements RetryStrategy {

    private long delay = 1000;

    public FixedDelayStrategy(long delay) {
        this.delay = delay;
    }

    @Override
    public long getDelay(int attempt) {
        return delay;
    }

}
