package genericClassesAndMethods20.ejercices;

import java.util.Scanner;

public class EjercicesPrintArray {
    public static void main(String[] args) {
        Integer[][] array = new Integer[3][3];

        try {
            pushArray(array);
            printArray(array);
            accessArray(array, 2, 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println();
            e.printStackTrace();
        }

        System.out.println("Programa finalizado correctamente");
    }

    public static <T> void pushArray(T[][] array) {
        Scanner input = new Scanner(System.in);
        Integer numArray;
        for( int raw = 0; raw<array.length; raw++ ){
            for(int column = 0; column<array[raw].length; column++) {
                numArray = input.nextInt();
                array[raw][column] = (T)  numArray;
            }
        }
    }

    public static <T> void printArray(T[][] array) {
        for( T[] raw : array ) {
            for( T column : raw ) {
                System.out.printf("%s ",column);
            }
            System.out.println();
        }
    }

    public static <T> void accessArray(T[][] array, Integer low, Integer high) throws InvalidSubscriptionException {
        if( low > array.length && high > array[0].length ) {
            throw new InvalidSubscriptionException("Invalid argument for array");
        } else {
            System.out.printf("array value in raw %s and column %s: %s%n", low, high, array[low][high]);
        }
    }
}
