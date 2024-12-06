package genericClassesAndMethods20.AdditionalCompileTimeTranslationIssuesMethodsThatUseaTypeParameterastheReturnType;

public class MaximumTest {
    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5,
                maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7,
                maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", "apple", "orange",
                maximum("pear", "apple", "orange"));
    }

    //Desafortunadamente, el operador relacional > no se puede usar con tipos de referencia. Sin embargo, es posible comparar dos objetos de la misma clase si esa clase implementa la interfaz genérica Comparable<T> (del paquete java.lang). Todas las clases de contenedor de tipos para tipos primitivos implementan esta interfaz. es decir, si uso un método genérico y quiero comparar dos o más objetos que pasé por parámetro a mi método, la forma de hacerlo es con la interfaz Comparable<T>, para eso debemos extender de la clase Comparable, como es metodo se usa extends, si fuera una clase se usa implements, pero para las clases es Comparator

    //determines the largest of three Comparable objects
    @SafeVarargs
    public static <T extends Comparable<T>> T maximum(T... inputArgs) {
        T max = inputArgs[0];

        for( T element : inputArgs )
            if( element.compareTo(max) > 0 )
                max = element;
        return max;
    }
}
