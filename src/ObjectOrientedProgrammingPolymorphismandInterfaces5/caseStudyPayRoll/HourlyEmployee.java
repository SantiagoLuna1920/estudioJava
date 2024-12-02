package ObjectOrientedProgrammingPolymorphismandInterfaces5.caseStudyPayRoll;

public class HourlyEmployee extends Employee {
    private double wage = 0.0; //wage per hour
    private double hours = 0.0; //hourse worked for week

    //constructor
    public HourlyEmployee( String FIRSTNAME, String LASTNAME, String SOCIALSECURITYNUMBER, double wage, double hours ) {
        super( FIRSTNAME, LASTNAME, SOCIALSECURITYNUMBER );
        if( wage < 0.0 ) //validate wage
            throw new IllegalArgumentException("Hourly week must be >= 0.0");

        if( hours < 0.0 || hours > 168.0 ) //validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;
    }

    //set wage
    public void setWage( double wage ){
        if( wage < 0.0 ) //validate wage
            throw new IllegalArgumentException("Hourly week must be >= 0.0");
        this.wage = wage;
    }

    //return wage
    public double getWage(){
        return this.wage;
    }

    //set hours worked
    public void setHours( double hours ){
        if( hours < 0.0 || hours > 168.0 ) //validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        this.hours = hours;
    }

    //returns hours worked
    public double getHours(){
        return this.hours;
    }

    //calculate earnings; override abstract method earnings in employee
    @Override
    public double earnings() {
        if( this.getHours() <= 40 )
            return this.getWage()*this.getHours();
        else
            return 40*this.getWage()+( this.getHours()-40 )*this.getWage()*1.5;
    }

    //return String representation of HourlyEmployee object
    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", this.getWage(),
                "hours worked", this.getHours());
    }
}
