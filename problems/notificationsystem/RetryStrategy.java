package problems.notificationsystem;

interface RetryStrategy {

    long getDelay(int attempt);
}

