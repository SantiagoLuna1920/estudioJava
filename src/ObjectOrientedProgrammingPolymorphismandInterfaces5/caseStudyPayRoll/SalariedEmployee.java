package ObjectOrientedProgrammingPolymorphismandInterfaces5.caseStudyPayRoll;

public class SalariedEmployee extends Employee {
    private double weeklySalary = 0.0;

    //constructor
    public SalariedEmployee( String FIRSTNAME, String LASTNAME, String SOCIALSECURITYNUMBER, double weeklySalary ) {
        super( FIRSTNAME, LASTNAME, SOCIALSECURITYNUMBER );

        if( weeklySalary < 0.0 )
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }


    //set salary
    public void setWeeklySalary( double weeklySalary ) {
        if( weeklySalary < 0.0 )
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    //return salary
    public double getWeeklySalary(  ) {
        return this.weeklySalary;
    }

    //calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return this.weeklySalary;
    }

    //return String representation of salariedEmployee object
    @Override
    public String toString(  ) {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
