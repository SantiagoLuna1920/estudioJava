package classAndObjects3.enumTypes;

public enum Book {
//implicitamente static, implicitamente final, los metodos si pueden ser public pero no se puede poner un metodo set ya que estas constantes son final
    //Declare constants of enum type
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear) { //el contructor del enum no es publico, es private, ya que solo se puede acceder a el desde el mismo objeto, osea desde sus constantes
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle( ) {
        return title;
    }

    public String getCopyrightYear( ) {
        return copyrightYear;
    }

   // public String toString( ) {
     //   return String.format("Hola %s", this.getTitle());
   // }

}