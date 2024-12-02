package lambdasAndStreams17.streamIntegerManipulations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        //display original values
        System.out.printf("Original values %s%n", Arrays.asList(values)); //los objetos de lista se pueden ver en la impresión cuando usamos %s, ya que son objetos

        //sort values in ascending order with streams
        //parece que ya no es necesario usar .collect(Collectors.toList());, solo usamos .toList();
        System.out.printf("Sorted values %s%n",
                Arrays.stream(values).sorted()
                        .collect(Collectors.toList()));
        System.out.printf("Sorted values %s%n",
                Arrays.stream(values).sorted().toList());

        //valores ordenados guardados en una variable tipo List
        List<Integer> valoresOrdenados = Arrays.stream(values).sorted()
                .toList();

        System.out.printf("Valores ordenados guardados en una variable tipo list: %s%n",valoresOrdenados);

        //values greater than 4
        List<Integer> greaterThan4 = Arrays.stream(values)
                .filter((Integer value) -> value > 4).toList();
        System.out.printf("Values greater than 4: %s%n", greaterThan4);
    }
}
