package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayReversor {

    private ArrayFlattener arrayFlattener = new ArrayFlattener();
    public List<Integer> reverseArray(List<List<Integer>> input){
        if(input == null) return null;
        return arrayFlattener.flatten(input).stream().sorted((a, b) -> b - a).collect(Collectors.toList());
    }

}
