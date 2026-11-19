
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws Exception {

        // Create thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create Callable tasks
        Callable<Integer> task1 = () -> {
            System.out.println("Task 1 is running");
            return 10 + 20;
        };

        Callable<Integer> task2 = () -> {
            System.out.println("Task 2 is running");
            return 30 + 40;
        };

        Callable<Integer> task3 = () -> {
            System.out.println("Task 3 is running");
            return 50 + 60;
        };

        // Submit tasks and store results in Future
        Future<Integer> f1 = executor.submit(task1);
        Future<Integer> f2 = executor.submit(task2);
        Future<Integer> f3 = executor.submit(task3);

        // Get results
        System.out.println("Result 1: " + f1.get());
        System.out.println("Result 2: " + f2.get());
        System.out.println("Result 3: " + f3.get());

        // Shutdown thread pool
        executor.shutdown();

        System.out.println("All tasks completed.");
    }
}

