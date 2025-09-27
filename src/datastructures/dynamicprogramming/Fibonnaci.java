package datastructures.dynamicprogramming;

public class Fibonnaci {
    private static Integer [] memo = new Integer[100];

    public int fib(int n) {
        if (memo[n] != null) {
            return memo[n];
        }

        if (n==0 ||n==1) {
            return n;
        }

        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }
}
