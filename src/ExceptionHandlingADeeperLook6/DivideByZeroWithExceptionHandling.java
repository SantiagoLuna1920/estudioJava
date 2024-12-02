package ExceptionHandlingADeeperLook6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static int quotient( int numerator, int denominator ) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false;
            } catch (InputMismatchException | IllegalArgumentException | ArithmeticException inputMismatchException) { //se pueden atrapar varias excepciones usando la barra vertical (|), fde esta forma podemos anexar estas excepciones en un solo cuerpo
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                scanner.nextLine(); // discard input so user can try again
                System.out.printf(
                        "You must enter a valid number. Please try again.%n%n");
                //inputMismatchException.printStackTrace(); para imprimir el error correspondiente a la excepcion
            } // el bloque finally {} lo puedo usar para liberar recursos del bloque try


        } while( continueLoop );


    }
}
