package org.mudassir.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Transform list of names to uppercase using streams, lambda and method reference
 */
public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>() ;

        names.add("Mudassir");
        names.add("Sanober");
        names.add("Danish");

        names = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        // method reference with arguments
        names.forEach(System.out::println);
    }
}
