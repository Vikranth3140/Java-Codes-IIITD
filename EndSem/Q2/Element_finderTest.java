package Q2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Element_finderTest {

    @Test
    public void Test1() {
        ArrayList<Integer> test_list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1323, 4433));
        Element_finder ef = new Element_finder(test_list);
        int element = 10;

        boolean response = ef.find_element(element);
        assertEquals(response, false);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> test_list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1323, 444));
        Element_finder ef = new Element_finder(test_list);
        int element = 444;

        boolean response = ef.find_element(element);
        assertEquals(response, true);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> test_list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1323, 4433));
        Element_finder ef = new Element_finder(test_list);
        int element = 5;

        boolean response = ef.find_element(element);
        assertEquals(response, true);
    }
}