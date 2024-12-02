package ExceptionHandlingADeeperLook6;

import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();

        //assert that the vaLUE is >= 0 and <= 10
        assert ( number >= 0 && number <= 10 ) : "Bad number; " + number; // si la condicion antes del : es true, entonces no se cumple el segundo argumento después del :
        System.out.printf("You entered %d%n", number); //voy en el 640
    }
} // voy en Chapter14StringsCharactersandRegularExpressions
