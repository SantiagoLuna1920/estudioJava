package classAndObjects3.ejercices;

import classAndObjects3.caseOfStudy.Time1;

public class Time2TestEjercices {
    public static void main(String[] args) {
        Time1 time2 = new Time1();

        time2.setTime(23,59,59);
        getTime(time2);
        System.out.println();
        System.out.println();
        time2.incrementHour();
        getTime(time2);
//voy en Enhancing class Date ejercicios página 400
    }

    public static void getTime(Time1 time){
        System.out.printf(time.toStringUniversal());
        System.out.println();
        System.out.printf(time.toString());
    }
}
