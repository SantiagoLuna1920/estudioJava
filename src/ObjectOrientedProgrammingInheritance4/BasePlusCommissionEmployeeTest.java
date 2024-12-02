package ObjectOrientedProgrammingInheritance4;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Sue","Jones","222-22-222", 10000, .06, 2000);
        CommissionEmployee employee1 = new CommissionEmployee("Sueeee","Joncdfddes","222-22-222333", 555000, .07);
//queda intacto la subclase con los valores dados a esa variable de instancia en caso de que cambiemos o modifiquemos los valores de una variable de instancia que sea el super padre de esa subclase, pero si usamos composition, al crear una variable de instancia de un objeto y pasarlo como referencia a otro objeto, al hacer cambios en los valores de la variable de instancia pasada por referencia pues esta va a modificar los valores del objeto que se pasó por referencia
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary rate is", employee.getBaseSalary());
        System.out.printf("%s %.2f%n", "earnings rate is", employee.earnings());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);
        employee.setBaseSalary(1000);
        System.out.printf("%n%s:%n%n%s%n","Updated employee information obtained by toString", employee);
        //voy en el 442, polimorfismo
    }
}
