package ObjectOrientedProgrammingInheritance4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; //Base salary per week

    //six-argument constructor
    public BasePlusCommissionEmployee( String FIRSTNAME, String LASTNAME, String SOCIALSECURITYNUMBER, double grossSales, double commissionRate, double baseSalary ) {
        super( FIRSTNAME, LASTNAME, SOCIALSECURITYNUMBER, grossSales, commissionRate ); //le paso unicamente los argumentos posibles del constructor padre

        if( baseSalary < 0.0 )
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    //set base salary
    public void setBaseSalary( double baseSalary ) {
        if( baseSalary < 0.0 )
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    //return base Salary
    public double getBaseSalary(  ){
        return this.baseSalary;
    }

    //calcultate earnings
    @Override //indicates that this method overrides a superclass method
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override//si no pongo super. me llama al toString de la sublcase actual, lo que genera un bucle infinito y problema de recursión
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
//voy en 450, caso de estudio polimorfismo
}
