package Chapter14StringsCharactersandRegularExpressions.classString;

public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("Hello");

        //use String constructors
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray,6,3);//esto es para elegir desde donde empezará la cadena, el primer argumento es el arreglo de caracteres, el segundo argumento es el índice desde donde voy a ver la cadena, y el tercer argumento es la cantidad de caracteres que deseo coger para que se muestren, solo funciona con un arreglo de caracteres, si le pasamos una cadena entonces debemos usar otros metodos, como el de cadena.getBytes()
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
    }
}
