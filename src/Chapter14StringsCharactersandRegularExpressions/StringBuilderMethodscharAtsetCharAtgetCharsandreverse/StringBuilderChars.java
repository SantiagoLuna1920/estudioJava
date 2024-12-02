package Chapter14StringsCharactersandRegularExpressions.StringBuilderMethodscharAtsetCharAtgetCharsandreverse;
//La clase StringBuilder proporciona los métodos charAt, setCharAt, getChars y reverse para controlar los caracteres en un StringBuilder (Fig.14.12). El método charAt (línea 12) toma un argumento entero y devuelve el carácter en el StringBuilder en ese índice. El método getChars (línea 15) copia los caracteres de un StringBuilder en la matriz de caracteres pasada como argumento. Este método toma cuatro argumentos: el índice inicial desde el que se deben copiar los caracteres en el StringBuilder, el índice que se encuentra más allá del último carácter que se va a copiar del StringBuilder, la matriz de caracteres en la que se van a copiar los caracteres y la ubicación inicial en la matriz de caracteres donde se debe colocar el primer carácter. El método setCharAt (líneas 21 y 22) toma un argumento entero y un argumento de carácter y establece el carácter en la posición especificada en StringBuilder en el argumento de carácter. El método reverse (línea 25) invierte el contenido de StringBuilder. Al intentar acceder a un carácter que está fuera de los límites de un StringBuilder, se produce una excepción StringIndexOutOfBoundsException.

public class StringBuilderChars
{
    public static void main(String[] args)
    {
        StringBuilder buffer = new StringBuilder("hello there");

        System.out.printf("buffer = %s%n", buffer.toString());
        System.out.printf("Character at 0: %c%nCharacter at 4: %s%n%n",
                buffer.charAt(0), buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0,buffer.length(),charArray,0);
        System.out.print("The characters are: ");

        for( char character : charArray )
            System.out.print(character);

        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        System.out.printf("%n%n buffer = %s", buffer.toString());

        buffer.reverse();
        System.out.printf("%n%n buffer = %s%n", buffer.toString());
    }
} // end class StringBuilderChars