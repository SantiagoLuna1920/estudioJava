package methods.a.deeper.look1.ejercices;

public class GreatestCommonDivisorMain {
    public static void main(String[] args) {
        greatestCommonDivisor(2366, 273);
    }
    public static void greatestCommonDivisor(int m, int d) {
        int r = -1;
        int aux = 1;
        if( m >= d ) {
            if(m == 0) {
                System.out.println(m);
            } else if(d == 0) {
                System.out.println(m);
            } else {
                while( r<0 || r>=d ) {
                    r = m - aux*d;
                    aux++;
                }
                if ( r == 0 ) {
                    System.out.println(d);
                } else {
                    greatestCommonDivisor(d,r);
                }
            }
        } else {
            greatestCommonDivisor(d,m);
        }
    }
}
