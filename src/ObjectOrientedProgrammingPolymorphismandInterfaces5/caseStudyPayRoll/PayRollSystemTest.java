package ObjectOrientedProgrammingPolymorphismandInterfaces5.caseStudyPayRoll;

public class PayRollSystemTest {
    public static void main(String[] args) {
        //create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
                basePlusCommissionEmployee.earnings());

        //create four-element Employee Array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[3] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[0] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for( Employee currentEmployee : employees ) {
            System.out.println(currentEmployee);

            if( currentEmployee instanceof BasePlusCommissionEmployee ){
                BasePlusCommissionEmployee employee = ( BasePlusCommissionEmployee ) currentEmployee;
                employee.setBaseSalary( 1.10*employee.getBaseSalary() );
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            } //end if
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        } //end for
        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
//no se pueden sobreescribir metodos en las subclases si los metodos en la superclase son final, para acceder a metodos privados desde una subclase a una superpadre se deben tener los metodos publicos en la superclase que llamen a estos metodos privados, los metodos privados solo pueden llamarse desde la clase en la que estén, una clase final no se puede heredar.
        employees[0].helloWorld();
        //voy en 463
    }
}
