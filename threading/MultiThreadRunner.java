import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadRunner {

    public static void main(String[] args) {
        // Create an ExecutorService with two threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit the tasks (instances of Runnable or Callable) to the ExecutorService
        executorService.submit(new MyRunnable("Thread 1"));
        executorService.submit(new MyRunnable("Thread 2"));

        // Shutdown the ExecutorService when you are done
        executorService.shutdown();
    }
}

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " Value " + i);
        }
    }
}
