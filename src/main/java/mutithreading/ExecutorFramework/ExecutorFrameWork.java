package mutithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameWork {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 9; i++) { // Changed < 10 to <= 9 or keep i < 10 for clarity
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println("Factorial of " + finalI + " = " + result);
            });
        }

        executor.shutdown(); // Stops accepting new tasks

        try {
            // Wait up to 10 seconds for all 9 tasks (approx. 3s total runtime) to complete
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Force cancel if they take longer
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
