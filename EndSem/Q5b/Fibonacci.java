package Q5b;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer> {
    int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n < 2) {
            return n;
        }
        Fibonacci left = new Fibonacci(this.n+1);
        Fibonacci right = new Fibonacci(this.n+2);
        left.fork();
        return right.compute() + left.join();
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(2);
        Fibonacci task = new Fibonacci(40);
        int result = pool.invoke(task);
    }
}