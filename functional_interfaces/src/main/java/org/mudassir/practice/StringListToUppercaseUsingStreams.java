package org.mudassir.practice;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Transforms the list of names to upper case and prints the transformed list
 */
public class StringListToUppercaseUsingStreams {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mudassir");
        names.add("Danish");
        names.add("Sanober");

        // tranform using map operation

        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        upperCaseNames.forEach(name -> System.out.println(name));
    }
}
