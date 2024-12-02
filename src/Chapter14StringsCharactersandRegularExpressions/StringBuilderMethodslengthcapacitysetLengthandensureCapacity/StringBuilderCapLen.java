package Chapter14StringsCharactersandRegularExpressions.StringBuilderMethodslengthcapacitysetLengthandensureCapacity;

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");
        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n",
                buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75); //con este método le damos una capacidad mínima al buffer
        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer); //voy en 657, leer la explicación después del código
    }
}
