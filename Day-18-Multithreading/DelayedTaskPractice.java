
public class DelayedTaskPractice {
    public static void main(String[] args) {
        Thread task = new Thread(() -> {
            try {
                System.out.println("Task started");

                Thread.sleep(2000);

                System.out.println("Task completed after delay");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task interrupted");
            }
        });

        task.start();
    }
}
