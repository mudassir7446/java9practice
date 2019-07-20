package org.mudassir.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Transform a List<List<String>> using flatmap
 */

public class TransformListOfListUsingFlatMap {
    public static void main(String[] args) {
        List<List<String>> keyValues = new ArrayList<>();
        keyValues.add(Arrays.asList("Apple","Red"));
        keyValues.add(Arrays.asList("Grapes","Green"));
        keyValues.add(Arrays.asList("Mango","Yellow"));
        keyValues.add(Arrays.asList("Orange","Orange"));

       List<String>keyValueFlat = keyValues.stream().flatMap(keyValue -> keyValue.stream()).collect(Collectors.toList());

       System.out.println("Before flat map transformation : "+ keyValues);
       System.out.println("Before flat map transformation : "+ keyValueFlat);
    }
}
