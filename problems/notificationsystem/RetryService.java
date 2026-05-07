package problems.notificationsystem;

class RetryService {

    public void execute(Notification notification) {
        int maxRetries = 3;

        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                notification.send("Notification from Retry Service");

                System.out.println("Success");
                return;

            } catch (Exception e) {
                System.out.println(
                        "Attempt " + attempt + " failed"
                );
            }
        }

        System.out.println("All retries failed");

    }
}
