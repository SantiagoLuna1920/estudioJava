package classAndObjects3.membersClassStatic;

public class EmployeeTest {
    public static void main(String[] args) {
       System.out.printf("Employees before instantiation: %d%n", Employee.getCount2()); //0

        //create two Employees; count should be 2
        Employee e1 = new Employee("Susan", "Baker"); //1
        Employee e2 = new Employee( "Bob", "Blue" ); //2

        //show that count is 2 after creating two Employees
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount2()); //2
        System.out.printf("via e2.getCount(): %d%n", e2.getCount2()); //2
       System.out.printf("via Employee.getCount(): %d%n",Employee.getCount2()); //2

        //get names of Employees
        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(),e2.getLastName());
//voy en página 400, ejercicios
    }
}//end class EmployeeTest
