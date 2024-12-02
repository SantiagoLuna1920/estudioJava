package classAndObjects3.ejercices;

import classAndObjects3.composition.Date;

public class DateAndTimeTest {
    public static void main(String[] args) {
        Time2 time2 = new Time2();
        Date date = new Date(12,31,2022);

        time2.setDate( date );
        time2.setTime( 23, 59, 58 );

        System.out.println("After increment second");
        for( int i = 0; i < 4; i++ ) {
            displayTime(time2);
            System.out.println();

            //VOY EN 408 "PROTECTED MEMBERS"
        }
    }
    public static void displayTime( Time2 time ) {
        time.incrementHour();
        System.out.printf("%nUniversal time: %s%nStandard time: %s%n", time.toStringUniversal(), time.toString());
    }
}
