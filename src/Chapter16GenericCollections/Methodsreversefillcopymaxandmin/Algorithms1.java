package Chapter16GenericCollections.Methodsreversefillcopymaxandmin;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        // create and display and List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = new LinkedList<>(Arrays.asList(letters)); // get List
        System.out.println("List contains: ");
        output(list);

        // reverse and display the List<Character>
        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse, list contains:%n");
        output(list);

        //create copyList from an array of 3 Characters
        Character[] lettersCopy = new Character[list.size()];
        List<Character> copyList = new LinkedList<>(Arrays.asList(lettersCopy));
//voy en 748
        // copy the contents of list into copyList
        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(copyList);

        // fill list with Rs
        Collections.fill(list, 'R'); // sirve para llenar la lista del objeto que le queramos dar
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }

    public static void output( List<Character> listRef ){
        System.out.print("The list is: ");

        for( Character element : listRef )
            System.out.printf("%s ", element);

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf("  Min %s%n", Collections.min(listRef));
        System.out.println();
    }
}
