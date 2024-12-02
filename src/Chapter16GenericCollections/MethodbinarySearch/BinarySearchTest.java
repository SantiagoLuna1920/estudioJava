package Chapter16GenericCollections.MethodbinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        // create an arraylist<String> from the contents of colors array
        String[] colors = {"red", "white", "blue", "black", "yellow",
                "purple", "tan", "pink"};
        List<String> list = new ArrayList<String>(Arrays.asList(colors));
        //voy en 750

        //para usar el metodo binarySearch del Collection primero debemos organizar la lista en orden ascendente con sort
        Collections.sort(list); // sort the ArrayList
        System.out.printf("Sorted ArrayList: %s%n", list);

        // search list for various values
        printSearchResults(list,"black");
        printSearchResults(list,"red");
        printSearchResults(list,"pink");
        printSearchResults(list,"aqua");
        printSearchResults(list,"gray");
        printSearchResults(list,"teal");
    }

    private static void printSearchResults( List<String> list, String key ) {
        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list,key); // Collections.binarySearch(lista,key) me devuelve un entero que sería el índice donde se encuentra el valor en la lista, si no está el valor este devuelve un negativo

        if( result>= 0 )
            System.out.printf("Found at index %d%n", result);
        else
            System.out.printf("Not found (%d)%n", result);
    }
}
