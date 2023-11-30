package Q2;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Element_finderTest.class);

        for (Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}