package classAndObjects3.composition;

public class Date {
    private int month = 0;
    private int day = 0;
    private int year = 0;
    private static final int[] daysPerMonth = {
            0,31,29,31,30,31,30,31,31,30,31,30,31
    };

    //constructor: confirm proper value for month and day given the year
    public Date( int month, int day, int year ) {
        //check if month in range
        if( month <= 0 || month > 12 )
            throw new IllegalArgumentException( "month(" + month + ") must be 1-12" );

        //check if day in range for month
        if( day<=0 || day > daysPerMonth[month] )
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        if( month==2 && day==29  && !(year%4==2) )
            throw new IllegalArgumentException("year (" + year + ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);

    }

    //method nextDay
    public void nextDay(  ) {
        if( this.month == 2 && this.year%4==2 ) {
            if( this.day+1>daysPerMonth[month] ) {
                nextMonth();
                setDate( this.month, 1, this.year );
            } else
                setDate( this.month, this.day+1, this.year );
        } else if( this.month == 2 && !(this.year%4==2) ) {
            if( this.day+1>daysPerMonth[month]-1 ) {
                nextMonth();
                setDate( this.month, 1, this.year );
            } else
                setDate( this.month, this.day+1, this.year );
        } else {
            if( this.day+1>daysPerMonth[month] ) {
                nextMonth();
                setDate( this.month, 1, this.year );
            } else
                setDate( this.month, this.day+1, this.year );
        }
    }

    //method nextMonth
    private void nextMonth(  ) {
        if( this.month+1 > daysPerMonth.length-1 ) {
            nextYear();
            setDate( 1, this.day, this.year );
        } else
            setDate( this.month+1, this.day, this.year );
    }

    //method nextYear
    private void nextYear(  ) {
        setDate( this.month, this.day, this.year+1 );
    }

    //method setDate
    private void setDate( int month, int day, int year ) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String toString( ) {
        return String.format("%d/%d/%d", month, day, year);
    }

}
