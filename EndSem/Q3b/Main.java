package Q3b;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitsError, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int low;
        int high;
        while (true) {
            try {
                while (true) {
                    try {
                        System.out.print("Print start of the array ");
                        low = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Enter valid integer");
                    }
                }

                while (true) {
                    try {
                        System.out.print("Print end of the array ");
                        high = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Enter valid integer");
                    }
                }

                if (low >= high) {
                    throw new LimitsError("Start should be greater than end");
                }
                break;
            } catch (LimitsError e) {
                throw new RuntimeException(e);
            }
        }

        ArrayList<Integer> find_Element = new ArrayList<>();
        for (int i = low ; i < high ; i++) {
            find_Element.add(i);
        }

        int toFind;
        while(true) {
            try {
                System.out.print("Enter the number to find ");
                toFind = scanner.nextInt();
                break;
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Enter valid integer");
            }
        }

        scanner.close();

        int mid = find_Element.size() / 2;

        Element_finderThread left = new Element_finderThread(0, mid, toFind, find_Element);
        Element_finderThread right = new Element_finderThread(mid + 1, find_Element.size(), toFind, find_Element);

        Thread t1 = new Thread(left);
        Thread t2 = new Thread(right);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        boolean result = left.getResult() || right.getResult();

        System.out.println("The search result is " + result);
    }
}