package arraysAndArraysList2;

public class PassArrayMain {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};

        System.out.printf("Effects of passing reference to entire array:%n" + "The values of the original array are:%n");

        for ( int number : array )
            System.out.printf("    %d ", number);

        modifyArray(array);
        System.out.printf("%n%nThe values of the modified array are:%n");
        for ( int number : array )
            System.out.printf("    %d ", number);

        System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]);
        System.out.printf("array[3] after modifyElement: %d%n",array[3]);

    }
    //cuando paso la referencia de un arreglo a un metodo, este es la copia del original, por lo que si modifico esta copia de la referencia, pues se va a modificar la original
    public static void modifyArray(int[] array2) {
        int[] array3 = array2;
        for ( int counter = 0; counter < array3.length; counter++ ) {
            array3[counter] = array3[counter]*2;
        }
    }

    public static void modifyElement( int element ) {
        element*=2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }
}
