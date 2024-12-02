package ObjectOrientedProgrammingPolymorphismandInterfaces5.caseStudyPayRoll;

//esta será la clase principal, osea la super clase abstracta, de la cual heredarán subclases, esta clase abstracta no se puede instanciar en una variable.
public abstract class Employee {
    private final String FIRSTNAME;
    private final String LASTNAME;
    private final String SOCIALSECURITYNUMBER;

    //CONSTRUCTOR
    public Employee( String FIRSTNAME, String LASTNAME, String SOCIALSECURITYNUMBER ) {
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.SOCIALSECURITYNUMBER = SOCIALSECURITYNUMBER;
    }

    //return first name
    public String getFirstName() {
        return this.FIRSTNAME;
    }

    //return last name
    public String getLastName() {
        return this.LASTNAME;
    }

    //return social security number
    public String getSocialSecurityNumber(){
        return this.SOCIALSECURITYNUMBER;
    }

    public final void helloWorld() {
        System.out.println("Hello world");
    }
    //return String representation of Employee object
    @Override
    public String toString(  ) {
        return String.format( "%s %s%nsocial security number: %s",getFirstName(), getLastName(), getSocialSecurityNumber() );
    }

    //abstract method must be overridden by concrete sublclasses
    public abstract double earnings(); //no implementation here
}
