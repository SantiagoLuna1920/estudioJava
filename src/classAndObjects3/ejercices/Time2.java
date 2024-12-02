package classAndObjects3.ejercices;

import classAndObjects3.composition.Date;

public class Time2 {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    private Date date;

    public void setDate( Date date ){
        this.date = date;
    }

    public void setTime(int hour, int minute, int second) {
        if ( hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60 )
            throw new IllegalArgumentException("Hour, minute and/or second was out of range");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //method tick
    public void tick( ){
        if( this.second+1 >= 60 ) {
            this.incrementMinute();
            this.setTime(this.hour, this.minute, 0);
        }
        else
            this.setTime( this.hour, this.minute, this.second+1 );
    }

    //method incrementMinute
    public void incrementMinute( ) {

        if( this.minute+1 >= 60 ) {
            this.incrementHour();
            this.setTime(this.hour, 0, this.second);
        }
        else
            this.setTime( this.hour, this.minute+1, this.second );

    }

    //method incrementHour
    public void incrementHour(  ) {
        if( this.hour+1 >= 24 ) {
            this.date.nextDay();
            this.setTime(0, this.minute, this.second);
        }
        else
            this.setTime(this.hour+1, this.minute, this.second);
    }

    //convert to String in universal-time format (HH:MM:SS)
    public String toStringUniversal() {
        return String.format("Current: %02d:%02d:%02d, of %s", hour, minute, second, this.date);
    }

    //convert to string in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("Current: %02d:%02d:%02d %s, of %s",  (( hour == 0 || hour == 12 ) ? 12 : hour%12), minute, second, (( hour>=12 ) ? "PM" : "AM"), this.date );
    }
} // voy en ObjectOrientedProgrammingInherintance4
