package methods.a.deeper.look1.ejercices;

public class SeparateDigitsMain {
    public static void main(String[] args) {
        
        displayDigits(987654321);

    }

    public static int integerPart(int a, int b)
    {
        return a / b;
    }

    public static int integerRemainder(int a, int b)
    {
        return a % b;
    }

    public static void displayDigits(int number)//567
    {
        int numeroRestante = 0;
        int auxDigito = number; //567
        int residuo = 0;
        String lengthNumber = String.valueOf(Integer.toString(number));
        int count = lengthNumber.length();
        int auxCounter = 0;
        int[] arrayReverse = new int[count];

        if( number != 0 ) {
            do{
                numeroRestante = integerPart(auxDigito, 10); //5
                residuo = integerRemainder(auxDigito, 10); //6
                auxDigito = numeroRestante; //5
                arrayReverse[auxCounter] = residuo;
                auxCounter++;
            } while(numeroRestante !=0);
            for (int i = 1; i <= count; i++) {
                System.out.print(" " + arrayReverse[count-i]); //7
            }
        } else {
            System.out.println("Ingrese un numero valido de 1 hasta 99999");
        }
    }
}
