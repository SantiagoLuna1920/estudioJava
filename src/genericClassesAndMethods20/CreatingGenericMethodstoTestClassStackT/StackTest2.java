package genericClassesAndMethods20.CreatingGenericMethodstoTestClassStackT;

import genericClassesAndMethods20.genericClasses.EmptyStackException;
import genericClassesAndMethods20.genericClasses.Stack;

import java.util.ArrayList;

public class StackTest2 {
    public static void main(String[] args) {
        Number[] numberElements = {1, 2.4, 3, 4.1}; // Integers and Doubles
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringElements = {"Hola", "xd", "como estás"};
        Character[] characterElements = {'H','E','L','L','O'};

        // Create a Stack<Double> and a Stack<Integer>
        //cuando creo una clase generica, en el main o donde instancie ese objeto generico, debo poner el tipo de dato como en las cuatro (4) siguientes instancias, y en este caso, los metodos estaticos tienen que ser de tipo de dato T, ya que mis arrays no son primitivos sino objetos, es buena práctica poner el tipo de dato entre los <> cuando instancie la clase
        Stack<Double> doubleStack = new Stack<Double>(5);
        Stack<Integer> integerStack = new Stack<Integer>();
        Stack<String> stringStack = new Stack<String>(10);
        Stack<Character> characterStack = new Stack<Character>();
        ArrayList<Number> numbers = new ArrayList<>();

        // push elements of doubleElements onto doubleStack
        testPush("doubleStack", doubleStack, doubleElements);
        testPop("doubleStack", doubleStack); // pop from doubleStack
        // push elements of integerElements onto integerStack
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack); // pop from integerStack
        // push elements of stringElements onto stringStack
        testPush("stringStack", stringStack, stringElements);
        testPop("stringStack", stringStack); // pop from stringStack
        // push elements of characterElements onto characterStack
        testPush("characterStack", characterStack, characterElements);
        testPop("characterStack", characterStack); // pop from characterStack


        for( Number value : numberElements ) {
            numbers.add(value);}

        double sum = (double) numbers.stream().reduce(0,(Number x, Number y) -> x.doubleValue() + y.doubleValue());
        System.out.printf("sum of type Number: %s", sum);
    }

    public static <T> void testPush(String name, Stack<T> stack, T[] values) {
        System.out.printf("%nPushing elements onto %s%n", name);
        for( T value : values ) {
            System.out.printf("%s ", value);
            stack.push(value);
        }
    }

    public static <T> void testPop( String name, Stack<T> stack ) {
        try {
            System.out.printf("%nPopping elements onto %s%n", name);
            T popValue;
            while(true) {
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        } catch(EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }
}
