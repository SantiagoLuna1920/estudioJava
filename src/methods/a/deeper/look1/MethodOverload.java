package methods.a.deeper.look1;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
    }

    public static int square(int a) {
        return a*a;
    }

    public static double square(double a) {
        return a*a; //quedé en 284
    }
}
