package org.mudassir.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Searches for a name in a list of duplicate names, if available prints the name, else prints 'notavailable'
 *
 */
public class SearchNameUsingLambda
{
    public static void main( String[] args )
    {

        List<String> names = new ArrayList<>();
        names.add("Danish");
        names.add("Mudassir");
        names.add("Sanober");
        names.add("Mudassir");

        // should print Mudassir
        String result = names.stream().filter(name -> "Mudassir".equals(name)).findFirst().orElse("notavailable");
        System.out.println("result : "+result);

        // should print 'notavailable'
        result = names.stream().filter(name -> "xyz".equals(name)).findFirst().orElse("notavailable");
        System.out.println("result : "+result);

    }

}
