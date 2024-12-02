package Chapter16GenericCollections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        //add colors elements to list1
        String[] colors =
                {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<String>();

        for( String color : colors )
            list1.add(color);

        //add colors2 elements to list2
        String[] colors2 =
                {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<String>();

        for( String color2 : colors2 )
            list2.add(color2);

        list1.addAll(list2); // concatenate Lists
        list2 = null; // release resources
        printList(list1); // print list1 elements

        convertToUppercaseStrings(list1); //convert to upper case string
        printList(list1); // print list1 elements

        System.out.printf("Deleting elements 4 to 6...");
        removeItems( list1, 4, 7 ); // remove items 4-6 from list1
        printList(list1);
        printReversedList(list1);

//voy en 737, leex explicación del código que acabo de implementar

    }

    // output List contents
    private static void printList( List<String> list ){
        System.out.printf("%nlist:%n");

        for( String color : list )
            System.out.printf("%s ", color);

        System.out.println();
    }

    // locate String objects and convert to uppercase
    private static void convertToUppercaseStrings( List<String> list){
        //ListIterator desciende de Iterator, ListIterator tiene más métodos, e Iterator tiene los métodos por defecto de la superclase Collection, para usar ListIterator debemos pasar como tipo de valor List, paras usar Iterator, debemos pasar como valor de variable Collection
        ListIterator<String> iterator = list.listIterator();

        while( iterator.hasNext() ) {
            String color = iterator.next(); // get item
            iterator.set(color.toUpperCase()); // convert to upper case
        }
    }

    // obtain sublist and use clear method to delete sublist items
    private static void removeItems( List<String> list, int start, int end)
    {
        list.subList(start,end).clear();
    }

    // print reversed list
    private static void printReversedList( List<String> list){
        ListIterator<String> iterator = list.listIterator();
        //volver una List en un iterador nos hace más fácil manipular esa lista, ya sea removiendo cadenas o ponerlas en reversa
        //print list in reverse order
        //hasPrevious y previous es lo mismo que hasNext y next, sólo que estos empiezan a iterar desde el final de la lista
        while( iterator.hasPrevious() ) {
            System.out.printf("hola");
            System.out.printf("%s ", iterator.previous());
        }
    }
}
