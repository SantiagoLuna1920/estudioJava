package Chapter16GenericCollections.MethodsaddAllfrequencyanddisjoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {
    public static void main(String[] args) {
        // initialize list1 and list2
        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        list3.add("oro");
        list3.add("eee");
        list3.add("qqq");

        list2.add("black");
        list2.add("red");
        list2.add("green");

        System.out.print("Before addAll, list2 contains: ");

        //display elements in list2
        for (String s : list2)
            System.out.printf("%s ", s);

        Collections.addAll(list2, colors); // al parecer, solo le puedo copiar elementos de un array a una lista

        System.out.printf("%nAfter addAll, list2 contains ");

        //display elements in list2
        for(String s : list2)
            System.out.printf("%s ", s);

        // get frequency of red
        int frequency = Collections.frequency(list2, "red");
        System.out.printf("%nFrequency of red in list2: %d%n", frequency);

        //check whether list1 and list2 have elements in common
        boolean disjoint = Collections.disjoint(list1,list2); // si no tienen elementos en común, me devuelve un true, caso contrario, me devuelve false si tienen elementos en común

        System.out.printf("list1 and list2 %s elements in common%n", (disjoint ? "do not have" : "have"));
    } // voy en 755 sets
}
