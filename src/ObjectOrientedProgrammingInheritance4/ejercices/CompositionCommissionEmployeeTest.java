package ObjectOrientedProgrammingInheritance4.ejercices;

public class CompositionCommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Santiago", "Luna","222-22-222", 2000, 0.5);
        BasePlusCommissionEmployee baseEmployee = new BasePlusCommissionEmployee(employee, 3000);
        System.out.println(baseEmployee);
        System.out.printf("Earnings rate is: %.2f",baseEmployee.earnings());
        employee.setCommissionRate(.1);
        System.out.printf("%nEarnings rate is: %.2f",baseEmployee.earnings());
    }
}
