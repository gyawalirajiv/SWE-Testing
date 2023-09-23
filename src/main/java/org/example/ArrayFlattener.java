package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayFlattener {
    public List<Integer> flatten(List<List<Integer>> arr){
        if(arr == null) return null;
        return arr.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
    }
}
