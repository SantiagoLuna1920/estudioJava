package ObjectOrientedProgrammingInheritance4.ejercices;

public class BasePlusCommissionEmployee {
    private double baseSalary; //Base salary per week
    private CommissionEmployee employee;

    //six-argument constructor
    public BasePlusCommissionEmployee( CommissionEmployee employee, double baseSalary ) {
        this.employee = employee;

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
    public double earnings() {
        return getBaseSalary() + this.employee.earnings();
    }

    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", this.employee, "base salary", getBaseSalary());
    }

}
