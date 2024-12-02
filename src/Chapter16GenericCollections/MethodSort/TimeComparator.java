package Chapter16GenericCollections.MethodSort;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> {
    //la interfaz Comparator tiene el metodo compare, se le pasan los dos objetos para así validar el mayor o menor de los objetos
    @Override
    public int compare(Time2 time1, Time2 time2){
        int hourDifference = time1.getHour() - time2.getHour(); //2
        int minuteDifference = time1.getMinute() - time2.getMinute();
        int secondDifference = time1.getSecond() - time2.getSecond();

        if( hourDifference != 0 )
            return hourDifference;
        else if( minuteDifference != 0 )
            return minuteDifference;
        else return secondDifference;
    }
}
