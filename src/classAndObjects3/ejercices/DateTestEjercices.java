package classAndObjects3.ejercices;

import classAndObjects3.composition.Date;

public class DateTestEjercices {
    public static void main(String[] args) {
        Date date = new Date(12,27,2021);
        for( int i = 0; i < 370; i++ )
            printDateDays( date );


    }

    public static void printDateDays( Date date ) {
        date.nextDay();
        System.out.println(date);
    }
}
