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

        //greaterThan4 List sorted with streams
        System.out.printf("Values greater than 4 (ascending with streams): %s%n",
                greaterThan4.stream().sorted().toList());

        //para usar el forEach() no se necesita llamar al stream().forEach() de una variable lista guardada con valores filtrados por streams
        System.out.print("Valores de variable greaterThan4 impresas con forEach(): ");
        greaterThan4.forEach((Integer value) -> System.out.printf("%d ", value));

        //si queremos imprimir los valores de una variable guardad con streams, ya sea por ordenamiento,
        //debemos poner stream() despues de la variable, ejemplo
        System.out.print("\nValores de variable greaterThan4 impresas con forEach() y ordenadas: ");
        greaterThan4.stream().sorted().forEach((Integer value) -> System.out.printf("%d ", value));

        //valor de reduce de la variable greaterThan4 con valores guardados por stream
        System.out.printf("%nvalor de reduce de la variable graterThan4: %d",greaterThan4.stream().reduce(0,(Integer x, Integer y) -> x + y));

        //valor de reduce de values guardada en una variable
        int valorReduceValues = Arrays.stream(values).sorted()
                .reduce(0,(Integer x, Integer y) -> x+y);
        System.out.printf("%nValor de reduce de values guardada en una variable: %d", valorReduceValues);

        //valor de reduce de greaterThan4 guardada en variable
        int valorReduceGreaterThan4 = greaterThan4.stream().reduce(0,(Integer x, Integer y) -> x + y);

        System.out.printf("%nValor de valorReduceGreaterThan4: %d", valorReduceGreaterThan4);

    }
}
