package Chapter14StringsCharactersandRegularExpressions.ConcatenatingStrings;

public class StringConcatenation {
    //El método String concat concatena dos objetos String (similar al uso del operador +) y devuelve un nuevo objeto String que contiene los caracteres de ambas Strings originales. La expresión s1.concat(s2) forma una cadena añadiendo los caracteres de s2 a los de s1. Las cadenas originales a las que se refieren s1 y s2 no se modifican.
    public static void main(String[] args) {
        String s1 = "Happy ";
        String s2 = "Birthday";
        s1 = s1 + "happy ";

        System.out.printf("s1 = %s%ns2 = %s%n%n", s1, s2);
        System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));
        System.out.printf("s1 after concatenation = %s%n", s1);
    }
} //end class StringConcatenation
