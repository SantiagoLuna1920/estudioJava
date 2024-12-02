package lambdasAndStreams17;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamOperationsMain {
    public static void main(String[] args) {
       int[] values = {3,10,6,1,4,8,2,5,9,7};

       //Display original Values
        System.out.print("Original values: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ",value));
        System.out.println();

        //count, min, max, sum and average of the values
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        //Sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values).reduce(0,(int x,int y) -> x + y));

        //Sum of squares of values with reduce method
        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values).reduce(0,(int x,int y) -> x + y*y));

        // product of values with method reduce
        System.out.printf("Product via method reduce: %d%n",
                IntStream.of(values).reduce(1,(int x, int y) -> x*y));

        //even values displayed in sortee order
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values)
                .filter((int value) -> value%2==0)
                .sorted().forEach((int value) -> System.out.printf("%d ",value));
        System.out.println();

        // odd values multiplied by 10 and displayed in sorted order
        System.out.print("Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
                .filter((int value) -> value%2!=0)
                .sorted()
                .map((int value) -> value*10).forEach((int value) -> System.out.printf("%d ",value));
        System.out.println();

        // sum range of integers from 1 to 10, exlusive
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
                IntStream.range(1,10).sum());

        // sum range of integer from 1 to 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
                IntStream.rangeClosed(1,10).sum());

        System.out.println(IntStream.of(values).summaryStatistics());

        //este objeto contiene los metodos getMax,getMin,getCount,getSum y getAverage, tiene encapsulado los valores min, max, sum, count y average como private
        IntSummaryStatistics staticsValues = IntStream.of(values).summaryStatistics();
        System.out.println(staticsValues.getMax());

        //imprimiendo los valores del array values para ver si se mutaron
     IntStream.of(values).forEach( (int value) -> System.out.printf("%d ", value) );

    }
}
