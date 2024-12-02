package methods.a.deeper.look1.ejercices;

public class PerfectNumbersMain {
    public static void main(String[] args) {
        isPerfect(10);
    }

    //crear metodo isPerfect y desplegar sus factores
    public static void isPerfect(int number) {
        int sumTotal = 0;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){

                if( j == i ) {
                    System.out.print(" " + j);
                } else {
                    System.out.print(" " + j + " +");
                }
                sumTotal += j;
            }
            System.out.println(": " + sumTotal);
            sumTotal = 0;
        }
    }
}
