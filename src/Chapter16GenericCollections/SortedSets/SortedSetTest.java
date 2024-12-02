package Chapter16GenericCollections.SortedSets;

import java.util.*;

public class SortedSetTest {
    public static void main(String[] args) {
        // create TreeSet from array colors
        String[] colors = {"yellow", "green", "black", "tan", "grey",
                "white", "orange", "red", "green"};
        TreeSet<String> tree = new TreeSet<String>(Arrays.asList(colors)); // sortedset solo funciona con tree set, ya que este almacena en un arbol los datos
        System.out.print("Sorted set: ");
        printSet(tree);
        SortedSet<String> fsf = tree.headSet("green"); // el metodo headSet de la interfaz SortedSet devuelve un subconjunto de tree, si se modifica entonces se modifica también en el conjunto tree
        SortedSet<String> fsff = tree.tailSet("green");


        printSet(fsf);
        System.out.println();
        printSet(fsff);
        fsf.add("errca");
        System.out.println();
        printSet(fsf);
        System.out.println();
        printSet(tree);


        // get headSet based on "orange"
        System.out.print("headSet (\"orange\"):  ");
        printSet(tree.headSet("orange"));

        // get tailSet based upon "orange"
        System.out.print("tailSet (\"orange\"):  ");
        printSet(tree.tailSet("orange"));

        // get first and last elements
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last: %s%n", tree.last());
    }

    // output SortedSet using enhanced for statement
    private static void printSet(Collection<String> set) {
        for (String s : set)
            System.out.printf("%s ", s);

        System.out.println();
    } // voy en 758 Maps
}
