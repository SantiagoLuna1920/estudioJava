package genericClassesAndMethods20.genericClasses;

public class StackTest {
    public static void main(String[] args) {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a Stack<Double> and a Stack<Integer>
        //cuando creo una clase generica, en el main o donde instancie ese objeto generico, debo poner el tipo de dato como en los dos siguientes instancias, y en este caso, los metodos estaticos no necesariamente tienen que ser de tipo de dato T, es buena práctica poner el tipo de dato entre los <> cuando instancie la clase
        Stack<Double> doubleStack = new Stack<Double>(5);
        Stack<Integer> integerStack = new Stack<Integer>();

        // push elements of doubleElements onto doubleStack
        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack); // pop from doubleStack

        // push elements of integerElements onto integerStack
        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack); // pop from IntegerStack
    }

    public static void testPushDouble(Stack<Double> stack, double[] values) {
        System.out.printf("%nPushing elements onto doubleStack%n");
        for( double value : values ) {
            System.out.printf("%s ", value);
            stack.push(value);
        }
    }

    public static void testPopDouble(Stack<Double> stack) {
        try {
            System.out.printf("%nPopping elements from doubleStack%n");
            double popValue;

            //remove all elements from stack
            while(true){
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    public static void testPushInteger(Stack<Integer> stack, int[] values) {
        System.out.printf("%nPushing elements onto integerStack%n");
        for( int value : values ) {
            System.out.printf("%s ", value);
            stack.push(value);
        }
    }

    public static void testPopInteger(Stack<Integer> stack) {
        try {
            System.out.printf("%nPopping elements from integerStack%n");
            int popValue;
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
