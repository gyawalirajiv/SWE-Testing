package org.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayReversorTest {

    @Mock
    private ArrayFlattener arrayFlattener;

    @InjectMocks
    private ArrayReversor arrayReversor = new ArrayReversor();

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
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
        output.add(9);
        output.add(5);
        output.add(4);
        output.add(3);
        output.add(1);
        output.add(0);

        List<Integer> flattenOutput = new ArrayList<>();
        flattenOutput.add(1);
        flattenOutput.add(3);
        flattenOutput.add(0);
        flattenOutput.add(4);
        flattenOutput.add(5);
        flattenOutput.add(9);
        when(arrayFlattener.flatten(input)).thenReturn(flattenOutput);

        assertEquals(arrayReversor.reverseArray(input), output);
        verify(arrayFlattener, times(1)).flatten(anyList());
    }

    @Test
    public void testForNullArrayInput(){
        assertEquals(arrayReversor.reverseArray(null), null);
    }


}