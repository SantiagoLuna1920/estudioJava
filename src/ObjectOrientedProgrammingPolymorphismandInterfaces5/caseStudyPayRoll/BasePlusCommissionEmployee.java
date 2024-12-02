package ObjectOrientedProgrammingPolymorphismandInterfaces5.caseStudyPayRoll;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary = 0.0;

    //constructor
    public BasePlusCommissionEmployee( String FIRSTNAME, String LASTNAME, String SOCIALSECURITYNUMBER, double grossSales, double commissionRate, double baseSalary ) {
        super(FIRSTNAME, LASTNAME, SOCIALSECURITYNUMBER, grossSales, commissionRate);

        if( baseSalary < 0.0 ) //validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }
    //set base salary
    public void setBaseSalary( double baseSalary ) {
        if( baseSalary < 0.0 ) //validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    //return base salary
    public double getBaseSalary() {
        return this.baseSalary;
    }

    //calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings() {
        return this.getBaseSalary() + super.earnings();
    }

    //return String representation of baseP,usCommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", this.getBaseSalary());
    }
}
