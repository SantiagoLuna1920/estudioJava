package arraysAndArraysList2;

import java.util.Arrays;

public class ArrayManipulationsMain {
    public static void main(String[] args) {
        //sort doubleArray into ascending order
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray); //organiza el array pasado como referencia para ponerlo en orden ascendente
        System.out.printf("%ndoubleArray: ");

        for( double value : doubleArray )
            System.out.printf("%.1f     ", value);

        //fill 10-element array with 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray,7); //.fill me sirve para llenar un array con el argumento pasado
        displayArray(filledIntArray, "filledIntArray");

        //copy array intArray into array intArrayCopy
        int[] intArray = { 6,5,4,3,5,2,1 };
        int[] intArrayCopy = new int[ intArray.length ];
        System.arraycopy( intArray, 0, intArrayCopy, 0, intArray.length ); // este me sirve para copiar arrays sin afectar al original
        displayArray( intArray, "intArray" );
        Arrays.sort( intArray );
        displayArray( intArrayCopy, "intArrayCopy" );
       // Arrays.sort( intArrayCopy );
       displayArray( intArray, "intArray" );//el .sort no afectó a intArrayCopy, porque no es una copia de la referencia

        //compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals( intArray, intArrayCopy );

        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));


        //compare intArray and filledIntArray for equality
        b = Arrays.equals( intArray, filledIntArray );
        System.out.printf("%n%nintArray %s filledIntArray%n", ( b ? "==" : "!=" ));

        //search intArray for the value 5
        int location = Arrays.binarySearch( intArray, 5 );

        if( location >= 0 ) {
            System.out.printf("Found 5 at element %d in intArray%n", location);
        }
        else {
            System.out.println("5 not found in intArray " + location);
        }

        location = Arrays.binarySearch( intArray, 8763 );

        if( location >= 0 ) {
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        }
        else {
            System.out.println("8763 not found in intArray " + location);
        }

        location = Arrays.binarySearch( filledIntArray, 7 );

        if( location >= 0 ) {
            System.out.printf("Found 7 at element %d in intArray%n", location);
        }
        else {
            System.out.println("7 not found in intArray " + location);
        }

    }

    public static void displayArray( int[] array, String description ) {
        System.out.printf("%n%s: ", description);

        for( int value : array )
            System.out.printf("%d ", value);
    }
}
