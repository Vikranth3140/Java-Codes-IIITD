package Q5a;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Fibonacci extends RecursiveAction {
    int n;
    int result;
    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    protected void compute() {
        if (n < 2) {
            this.result = n;
        }
        Fibonacci left = new Fibonacci(this.n-1);
        Fibonacci right = new Fibonacci(this.n-2);

        left.fork();
        right.compute();
        left.join();

        this.result = left.result + right.result;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(2);
        Fibonacci task = new Fibonacci(40);
        pool.invoke(task);
        int result = task.result;
    }
}