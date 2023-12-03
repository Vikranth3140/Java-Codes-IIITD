package Q2;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Element_finderTest {
    @Test
    public void Test1() {
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 10));
        Element_finder ef = new Element_finder(testList);

        boolean res = ef.find_element(10);
        assertEquals(true, res);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 10));
        Element_finder ef = new Element_finder(testList);

        boolean res = ef.find_element(14);
        assertEquals(true, res);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 17));
        Element_finder ef = new Element_finder(testList);

        boolean res = ef.find_element(17);
        assertEquals(true, res);
    }
}