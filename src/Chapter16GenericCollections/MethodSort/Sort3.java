package Chapter16GenericCollections.MethodSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<Time2>();

        list.add( new Time2(6,24,34) ); //1
        list.add( new Time2(18,14,58) ); //2
        list.add( new Time2(6,5,34) ); // 3
        list.add( new Time2(12,14,58) ); //4
        list.add( new Time2(6,24,22) ); //5

        // output list elements
        System.out.printf("Unsorted array elements: %s%n", list);

        // sort in order using a comparator
        Collections.sort( list, new TimeComparator() );
// 3,5,1,4,2
        // output list elements
        System.out.printf("Sorted list elements: %s%n", list); // voy en 744 Method shuffle
    }
}
