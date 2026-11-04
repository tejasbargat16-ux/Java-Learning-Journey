
public class MultithreadedTaskRunner {

    static void performTask(String taskName, int delay)
            {
        try {
            System.out.println(
                taskName + " started on " +
                Thread.currentThread().getName()
            );

            Thread.sleep(delay);

            System.out.println(taskName + " completed");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(taskName + " interrupted");
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        Thread dataTask = new Thread(
            () -> performTask("Data Processing", 2000),
            "Data-Thread"
        );

        Thread reportTask = new Thread(
            () -> performTask("Report Generation", 3000),
            "Report-Thread"
        );

        Thread notificationTask = new Thread(
            () -> performTask("Notification", 1500),
            "Notification-Thread"
        );

        System.out.println("NEXUS Task Runner Started");

        dataTask.start();
        reportTask.start();
        notificationTask.start();

        dataTask.join();
        reportTask.join();
        notificationTask.join();

        System.out.println("All tasks completed!");
    }
}
