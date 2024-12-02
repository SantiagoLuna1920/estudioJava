package ObjectOrientedProgrammingInheritance4;

public class CommissionEmployee {
    private final String FIRSTNAME;
    private final String LASTNAME;
    private final String SOCIALSECURITYNUMBER;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String FIRSTNAME, String LASTNAME, String SOCIALSECURITYNUMBER, double grossSales, double commissionRate) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate mmust be > 0.0 and < 1.0");

        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.SOCIALSECURITYNUMBER = SOCIALSECURITYNUMBER;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return this.FIRSTNAME;
    }

    public String getLastName() {
        return this.LASTNAME;
    }

    public String getSocialSecurityNumber() {
        System.out.printf("hola desde llamad metodo estatico");
        return getSocial();
    }

    private String getSocial() {
        return this.SOCIALSECURITYNUMBER;
    }

    public void setGrossSales( double grossSales ) {
        if( grossSales < 0.0 )
            throw new IllegalArgumentException( "Gross sales must be >= 0.0" );

        this.grossSales = grossSales;
    }

    public double getGrossales() {
        return this.grossSales;
    }

    public void setCommissionRate( double commissionRate ) {
        if( commissionRate <= 0.0 || commissionRate >= 1.0 )
            throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0" );
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double earnings() {
        return getCommissionRate()*getGrossales();
    }
// CUANDO PONEMOS @Override esto significa que anulamos el metodo de la superclase de acuerdo a la clase presente, es decir, estamos en una subclase que va a utilizar un metodo de la superclase, pero para que podamos utilizar el metodo propio de nuestra clase actual escribimos la palabra @Override para que así no llamemos al metodo de la superclase
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossales(),
                "commission rate", getCommissionRate());
    }
    //voy en 423
}
