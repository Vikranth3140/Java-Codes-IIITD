package Q2;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class Main {
    public static void main(String[] args) {
        Result r = JUnitCore.runClasses(Element_finderTest.class);

        for (Failure failure: r.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(r.wasSuccessful());
    }
}