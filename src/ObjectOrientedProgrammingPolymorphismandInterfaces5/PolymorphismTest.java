package ObjectOrientedProgrammingPolymorphismandInterfaces5;

import ObjectOrientedProgrammingInheritance4.BasePlusCommissionEmployee;
import ObjectOrientedProgrammingInheritance4.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        //Assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);

        //Assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        //invoke toString on superClass object using superclass variable
        System.out.printf("%s %s:%n%n%s%n%n","Call CommissionEmployee's toString with superclass reference ", "to superclass object", commissionEmployee);

        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:%n%n%s%n%n","Call BasePlusCommissionEmployee's toString with subclass","reference to subclass object", basePlusCommissionEmployee);

        //invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n","Call BasePlusCommissionEmployee's toString with superclass","reference to subclass object", commissionEmployee2);
        CommissionEmployee commissionEmployee3 = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 400);

        System.out.printf("%n%s", commissionEmployee3);

        //voy en 445 metodos y clases abstractas
    }
}
