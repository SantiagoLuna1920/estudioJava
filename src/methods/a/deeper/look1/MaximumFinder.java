package methods.a.deeper.look1;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("The maximum number is " + result);

    }

    public static double maximum (double a, double b, double c) {

        return Math.max(Math.max(a, b), c);
    }
}
