package Chapter16GenericCollections.sets;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        // create and display a List<String>
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);
Set<String> set2 = new HashSet<String>(Arrays.asList(colors));
        // eliminate duplicates then print the unique values
        printNonDuplicates(list);
        // Collection se usa para asignar un tipo de variable y Collections se usa para acceder a los métodos de este
    }

    // create a set from a Collection to eliminate duplicates
   private static void printNonDuplicates( Collection<String> values ) {
        // create a HashSet
       Set<String> set = new HashSet<String>(values); // HashSet de la colleción Set me elimina los duplicados y me almacena los datos es una tabla hash, y el TreeSet en un arbol "tree"
       System.out.printf("%nNonduplicates are: ");

       for (String value : set)
           System.out.printf("%s ", value);

       System.out.println();
   } // voy en 756 sorted tests
}
