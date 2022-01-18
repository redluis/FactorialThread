import java.security.InvalidParameterException;

public class Factorial {
    private long result = 1;

    public long getResult() {
        return this.result;
    }

    public static long factorial(int n) throws InvalidParameterException {
        if (n < 0) {
            throw new InvalidParameterException("Parameter should be positive");
        }

        if (n == 0) {
            return 1;
        }

        return n > 1 ? n * factorial(n - 1) : 1;
    }

    public static long factorialCycle(int n) {
        long result = 1;

        if (n < 0) {
            throw new InvalidParameterException("Parameter should be positive");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    private long partFactorialRec(int begin, int end) {
        if (begin == end) return 1;
        return begin > end ? begin * partFactorialRec(begin - 1, end) : end;
    }

    public void partFactorial(int begin, int end) {
        this.result *= partFactorialRec(begin, end);
    }

    public void partFactorialCycle(int begin, int end) {
        for (int i = begin; i > end; i--) {
            this.result *= i;
        }
    }
}
