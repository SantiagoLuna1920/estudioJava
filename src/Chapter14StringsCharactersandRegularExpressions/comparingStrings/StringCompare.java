package Chapter14StringsCharactersandRegularExpressions.comparingStrings;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("hello"); //s1 is a copy of "hello"
        String s2 = "hello";
        String s3 = "Happy birthday";
        String s4 = "happy birthday";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);

        //test for equality
        if( s1.equals(s2) ) //true
            System.out.println("s1 equals \"hello\"");
        else
            System.out.println("s1 does not equal \"hello\"");

        //test for equality with ==
        if(s1 == "hello") //false; they are not the same object
            System.out.println("s1 is the same object as \"hello\"");
        else
            System.out.println("s1 is not the same object as \"hello\"");

        //test for equality (ignore case)
        if( s3.equalsIgnoreCase(s4) ) //true
            System.out.printf("%s equals %s with case ignored%n", s3, s4);
        else
            System.out.println("s3 does not equal s4");

        //test compareTo
        System.out.printf( "%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf( "%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf( "%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf( "%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf( "%ns4.compareTo(s3) is %d%n%n", s4.compareTo(s3));

        //test regionMatches (case sensitive)
        if( s3.regionMatches(false, 0,s4,0,5) ) //El primer argumento de esta versión del método es el índice inicial de la cadena que invoca el método. El segundo argumento es una cadena de comparación. El tercer argumento es el índice inicial de la cadena de comparación. El último argumento es el número de caracteres que se van a comparar entre las dos cadenas
            System.out.println("First 5 characters of s3 and s4 match");
        else
            System.out.println("First 5 characters of s3 and s4 do not match");

        //test regionMatches, (ignore case)
        if( s3.regionMatches( true, 0, s4, 0, 5  ) )//Cuando el primer argumento es verdadero, el método omite las mayúsculas y minúsculas de los caracteres que se comparan. Los argumentos restantes son idénticos a los descritos para el método regionMatches de cuatro argumentos.
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        else
            System.out.println("First 5 characters of s3 and s4 do not match"); //voy 648
    }
}