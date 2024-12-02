package classAndObjects3.composition;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date( 3, 30, 1985 );
        Date hire = new Date( 3,12, 1988 );

        Employee employee = new Employee( "Bob", "Blue", birth, hire );

        System.out.println(employee);
        System.out.println(birth);
        //quedé en el 379, enum types
    }
}
