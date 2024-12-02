package classAndObjects3.enumTypes;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books:");

        //print all books in enum book
        for( Book book : Book.values() ) //al imprimir los books sin llamar a alguno de sus metodos, este imprime el que tiene por defecto en el toString, tal como si fuera una clase, pero si no tiene metodo toString, este imprime el valor de la constante correspondiente del enum
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
    }
}
