public class Main {
    public static void main(String[] args) {
        int input = 20;

        System.out.println("*****Factorial (1 thread, rec)*****");
        long start = System.currentTimeMillis();
        System.out.println(Factorial.factorial(input));
        long time = System.currentTimeMillis() - start;
        System.out.println(time + " ms");
        System.out.println("******************");

        System.out.println("\n*****Factorial (4 threads, rec)*****");
        start = System.currentTimeMillis();
        try {
            System.out.println(MultiThreadingCalculations.factorialThreadsRec(input));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        time = System.currentTimeMillis() - start;
        System.out.println(time + " ms");
        System.out.println("******************");

        System.out.println("\n*****Factorial (1 thread, cycle)*****");
        start = System.currentTimeMillis();
        System.out.println(Factorial.factorialCycle(input));
        time = System.currentTimeMillis() - start;
        System.out.println(time + " ms");
        System.out.println("******************");


        System.out.println("\n*****Factorial (4 threads, cycle)*****");
        start = System.currentTimeMillis();
        try {
            System.out.println(MultiThreadingCalculations.factorialThreadsCycle(input));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        time = System.currentTimeMillis() - start;
        System.out.println(time + " ms");
        System.out.println("******************");
    }
}
