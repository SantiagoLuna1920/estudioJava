package classAndObjects3.caseOfStudy;

public class Time1 {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public void setTime( int hour, int minute, int second ) {
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
        if( this.hour+1 >= 24 )
            this.setTime( 0, this.minute, this.second );
        else
            this.setTime(this.hour+1, this.minute, this.second);
    }

    //convert to String in universal-time format (HH:MM:SS)
    public String toStringUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //convert to string in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%02d:%02d:%02d %s",  (( hour == 0 || hour == 12 ) ? 12 : hour%12), minute, second, (( hour>=12 ) ? "PM" : "AM") );
    }
}
