package Chapter14StringsCharactersandRegularExpressions.StringBuilderappendMethods;

public class StringBuilderAppend {
    public static void main(String[] args)
    {
        Object objectRef = "hello"; // assign string to an Object reference
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; // L suffix indicates long
        float floatValue = 2.5f; //f indicates that 2.5 is a float
        double doubleValue = 33.333; // no suffix, double is default

        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();

        buffer.append(objectRef)
                .append(" ")
                .append(string)
                .append("\n")
                .append(charArray)
                .append("\n")
                .append(charArray, 0, 3)
                .append("\n")
                .append(booleanValue)
                .append("\n")
                .append(characterValue)
      .append("\n")
            .append(integerValue)
            .append("\n")
            .append(longValue)
            .append("\n")
            .append(floatValue)
            .append("\n")
            .append(doubleValue)
            .append("\n")
            .append(lastBuffer);

        System.out.printf("buffer contains%n%s%n", buffer.toString());
        System.out.println(buffer.capacity());
        System.out.println(buffer.length());
    }
}
