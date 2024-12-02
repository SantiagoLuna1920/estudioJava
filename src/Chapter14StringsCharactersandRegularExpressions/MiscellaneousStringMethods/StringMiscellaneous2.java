package Chapter14StringsCharactersandRegularExpressions.MiscellaneousStringMethods;

import java.util.Locale;

public class StringMiscellaneous2 {
    //Class String proporciona varios métodos que devuelven cadenas o matrices de caracteres que contienen copias del contenido de una cadena original que luego se modifican. Estos métodos, ninguno de los cuales modifica la cadena en la que se llaman, se muestran a continuación
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "   spaces   ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        //test method replace
        String s1N = s1.replace('l','L');
        System.out.printf("Replace 'l' with 'L' in s1N: %s%n%n", s1N);

        //test toLowerCase and toUpperCase
        System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s%n%n", s2.toLowerCase());

        //test trim method para quitar los espacios de una cadena
        System.out.printf("s3 after trim = \"%s\"%n%n", s3.trim());

        //test toCharArray method
        char[] charArray = s1N.toCharArray(); //con este creamos un array de caracteres de la cadena que invoca este método

        for( char character : charArray )
            System.out.print( character );

        System.out.println();
    } //voy en StringBuilderappendMethods
} // end class StringMiscellaneous2
