package org.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

class ArrayFlattenerTest {

    private ArrayFlattener arrayFlattener = new ArrayFlattener();

    @BeforeAll
    public static void before(){
    }

    @Test
    public void testForValidRwoDimensionalArrayInput(){
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        List<Integer> l2 = new ArrayList<>();
        l2.add(0);
        List<Integer> l3 = new ArrayList<>();
        l3.add(4);
        l3.add(5);
        l3.add(9);
        input.add(l1);
        input.add(l2);
        input.add(l3);

        List<Integer> output = new ArrayList<>();
        output.add(1);
        output.add(3);
        output.add(0);
        output.add(4);
        output.add(5);
        output.add(9);
        assertEquals(arrayFlattener.flatten(input), output);
    }

    @Test
    public void testForNullArrayInput(){
        assertEquals(arrayFlattener.flatten(null), null);
    }


}