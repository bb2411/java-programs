public class Mythread extends Thread {
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }

    public static void main(String args[]) {
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
