package genericClassesAndMethods20.motivationForGenericMethods;

public class OverloadedMethods {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1,2,3,4,5,6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[]characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray);
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray);
    }

    //METHOD printArray to print Integer array
    public static void printArray(Integer[] inputArray) {
        for( Integer element : inputArray )
            System.out.printf("%s ", element);
        System.out.println();
    }

    //METHOD printArray to print Double array
    public static void printArray(Double[] inputArray) {
        for( Double element : inputArray )
            System.out.printf("%s ", element);
        System.out.println();
    }

        //METHOD printArray to print Character array
    public static void printArray(Character[] inputArray) {
        for( Character element : inputArray )
            System.out.printf("%s ", element);
        System.out.println();
    }

}
