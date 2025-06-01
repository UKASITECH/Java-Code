public class Threads {
    // This class demonstrates the concept of multithreading in Java.

    // A simple thread class that extends the Thread class
    static class MyThread extends Thread {
        private String threadName;

        // Constructor to set the thread name
        MyThread(String name) {
            threadName = name;
        }

        // The run method is where the thread's task is defined
        public void run() {
            System.out.println(threadName + " is starting.");
            try {
                // Simulating some work with sleep
                for (int i = 0; i < 5; i++) {
                    System.out.println(threadName + " is working: " + i);
                    Thread.sleep(500); // Sleep for 500 milliseconds
                }
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
            System.out.println(threadName + " has finished.");
        }
    }

    public static void main(String[] args) {
        // Creating two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished.");
    }
}