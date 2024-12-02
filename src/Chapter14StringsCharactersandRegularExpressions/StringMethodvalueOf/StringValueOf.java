package Chapter14StringsCharactersandRegularExpressions.StringMethodvalueOf;


public class StringValueOf {
    //Como hemos visto, cada objeto en Java tiene un método toString que permite a un programa obtener la representación de la cadena del objeto. Desafortunadamente, esta técnica no se puede usar con tipos primitivos porque no tienen métodos. Class String proporciona métodos estáticos que toman un argumento de cualquier tipo y lo convierten en un objeto String. En la figura 14.9 se muestran los métodos valueOf de la clase String. La expresión String.valueOf(charArray) en la línea 18 utiliza la matriz de caracteres char Array para crear un nuevo objeto String. La expresión String.valueOf(charArray,3,3) en la línea 20 utiliza una parte de la matriz de caracteres charArray para crear un nuevo objeto String. El segundo argumento especifica el índice inicial a partir del cual se utilizan los caracteres. El tercer argumento especifica el número de caracteres que se van a utilizar
    public static void main(String[] args)
    {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; // L suffix indicates long
        float floatValue = 2.5f; //f indicates that 2.5 is a float
        double doubleValue = 33.333; // no suffix, double is default
        Object objectRef = "hello"; // assign string to an Object reference

        System.out.printf(
                "char array = %s%n", String.valueOf(charArray));
        System.out.printf("part of char array = %s%n",
            String.valueOf(charArray,3,3));
        System.out.printf(
            "boolean = %s%n", String.valueOf(booleanValue));
        System.out.printf(
            "char = %s%n", String.valueOf(characterValue));
        System.out.printf("int = %s%n", String.valueOf(integerValue));
        System.out.printf("long = %s%n", String.valueOf(longValue));
        System.out.printf("float = %s%n",String.valueOf(floatValue));
                System.out.printf(
                        "double = %s%n", String.valueOf(doubleValue));
        System.out.printf("Object = %s", String.valueOf(objectRef));
    } //voy en 655 class StringBuilder

} // voy en Chapter16GenericCollections
