import java.util.ArrayList;

public class MultiThreadingCalculations {
    public static long factorialThreadsRec(int n) throws InterruptedException {
        Factorial factorial = new Factorial();
        ArrayList<Thread> pool = new ArrayList<>();

        pool.add(new Thread(() -> factorial.partFactorial(n / 4, 1)));
        pool.add(new Thread(() -> factorial.partFactorial(n / 2, n / 4)));
        pool.add(new Thread(() -> factorial.partFactorial(n - n / 2, n / 2)));
        pool.add(new Thread(() -> factorial.partFactorial(n, n - n / 2)));

        for (Thread thread : pool) {
            thread.start();
        }

        for (Thread thread : pool) {
            thread.join();
        }

        return factorial.getResult();
    }
    public static long factorialThreadsCycle(int n) throws InterruptedException {
        Factorial factorial = new Factorial();
        ArrayList<Thread> pool = new ArrayList<>();

        pool.add(new Thread(() -> factorial.partFactorialCycle(n / 4, 1)));
        pool.add(new Thread(() -> factorial.partFactorialCycle(n / 2, n / 4)));
        pool.add(new Thread(() -> factorial.partFactorialCycle(n - n / 2, n / 2)));
        pool.add(new Thread(() -> factorial.partFactorialCycle(n, n - n / 2)));

        for (Thread thread : pool) {
            thread.start();
        }

        for (Thread thread : pool) {
            thread.join();
        }

        return factorial.getResult();
    }

}
