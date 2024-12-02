package Chapter14StringsCharactersandRegularExpressions.StringMethodslengthcharAtandgetChars;

public class StringMiscellaneous {
    public static void main(String[] args) {

        //Los métodos de cadena length, charAt y getChars devuelven la longitud de una cadena, obtienen el carácter en una ubicación específica de una cadena y recuperan un conjunto de caracteres de una cadena como una matriz char, respectivamente. El siguiente código muestra cada uno de estos métodos.
        String s1 = "Hello there";
        char[] charArray = new char[6];
        System.out.printf("s1: %s",s1);

        //test length method
        System.out.printf("%nLength of s1: %d", s1.length());

        //loop through characters in s1 with charAtand display reversed
        System.out.printf("%nThe String reversed is: ");
        for( int count = s1.length()-1; count>=0; count-- )
            System.out.printf("%c ", s1.charAt(count));

        //copy characters from String into charArray
        s1.getChars( 0,5, charArray, 0 ); //este metodo no tenemos necesidad de guardar su valor en una variable, este metodo nos proporciona lo necesario para almacenar el array de caracteres de la cadena en l variable adecuada, el primer argumento es el indice desde donde voy a copiar la cadena, el segundo es el indice hasta donde quiero la cadena, el tercer argumento es el arreglo de caracteres al que le voy a pasar la cadena para que sean caracteres, y el cuarto argumento es desde donde voy a empezar a copiar en la matriz del array
        System.out.printf("%nThe character array is: ");

        for( char character: charArray )
            System.out.print(character);

        System.out.println();


    }
}
