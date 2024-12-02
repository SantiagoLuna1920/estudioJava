package ObjectOrientedProgrammingPolymorphismandInterfaces5.caseStudyPayRoll;

public class CommissionEmployee extends Employee{
    private double grossSales = 0.0; //gross weekly sales
    private double commissionRate = 0.0; //commission percentage

    //constructor
    public CommissionEmployee( String FIRSTNAME, String LASTNAME, String SOCIALSECURITYNUMBER, double grossSales, double commissionRate ) {
        super( FIRSTNAME, LASTNAME, SOCIALSECURITYNUMBER );
        if( commissionRate <= 0.0 || commissionRate >=1.0 ) //validate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        if( grossSales < 0.0 ) //validate
            throw new IllegalArgumentException("Gross sale must be >= 0.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    //set gross sales amount
    public void setGrossSales( double grossSales ) {
        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    //return gross sales amount
    public double getGrossSales() {
        return this.grossSales;
    }

    //set commission rate
    public void setCommissionRate( double commissionRate ) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    //return commission rate
    public double getCommissionRate() {
        return this.commissionRate;
    }

    //calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return this.getCommissionRate()*this.getGrossSales();
    }

    //return String representation of CommissionEmployee object
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", this.getGrossSales(),
                "commission rate", this.getCommissionRate());
    }
}
