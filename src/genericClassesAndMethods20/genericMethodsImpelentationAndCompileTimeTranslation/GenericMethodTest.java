package genericClassesAndMethods20.genericMethodsImpelentationAndCompileTimeTranslation;

public class GenericMethodTest {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1,2,3,4,11,5,6,3,6,10,2};
        Double[] doubleArray = {1.1, 2.2, 3.3,9.9, 4.4, 5.5, 6.6, 7.7};
        Character[]characterArray = {'H', 'E', 'L','z', 'L','Z', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray);
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray);
    }

    // generic method printArray, el <T> va antes del tipo de retorno
    public static <T extends Comparable<T>> void printArray(T[] inputArray) {
        T max = inputArray[0];
        for( T element : inputArray ) {
            System.out.printf("%s ", element);
            if( element.compareTo(max) > 0 ) {
                max = element;
            }
        }
        System.out.printf("%nElemento máximo: %s", max);
    }
}
