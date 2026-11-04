
public class JoinPractice {
    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Task A: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Task B: " + i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both tasks completed!");
    }
}
