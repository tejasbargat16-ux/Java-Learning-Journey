
class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable task: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        t1.start();

        System.out.println("Main method running");
    }
}
