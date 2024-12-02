package classAndObjects3.membersClassStatic;

public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;
    private final int NUMERO;

    public Employee( String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
        ++count;
        this.NUMERO = count; //solo se pueden incializar variables final en el constructor como parametro o en la declaración de la variable
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    //get first name
    public String getFirstName() {
        return firstName;
    }

    //get last name
    public String getLastName() {
        return lastName;
    }

    //static method to get static count value
    private static int getCount() {
        return count;
    } // ya estudié membersClassStatic del módulo classAndObjects3

    public static int getCount2() {
        return getCount();
    }
//recordatorio de que los metodos final son para que no puedan ser sobreescritos en las subclases
    public final int getNumero(){
        return this.NUMERO;
    }
} //end class Employee