package arraysAndArraysList2;

public class InitArrayMain {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[10];
        int[] array2 = new int[]{10,20,30,40,50,60,70,80,90,100};
        int[] array3 = new int[ARRAY_LENGTH];

        System.out.printf("%s%8s%n", "Index", "Value");

        for( int counter = 0; counter < array.length; counter++ )
            System.out.printf("%5d%8d%n", counter, array[counter]);

        System.out.println();

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter2 = 0; counter2 < array2.length; counter2++)
            System.out.printf("%5d%8d%n", counter2, array2[counter2]);

        for ( int counter3 = 0; counter3 < array3.length; counter3++ )
            array3[counter3] = 2+2*counter3;

        System.out.printf("%s%8s%n", "Index", "Value");

        for ( int counter4 = 0; counter4< array3.length; counter4++ )
            System.out.printf("%5d%8d%n", counter4, array3[counter4]);
    }
}
