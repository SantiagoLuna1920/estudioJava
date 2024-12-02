package arraysAndArraysList2.caseOfStudy;

public class GradeBookTestMain {
    public static void main(String[] args) {
        int[] gradesArray = new int[]{87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        GradeBook2 myGradeBook = new GradeBook2("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",myGradeBook.getCourseName());
        myGradeBook.processGrades();
        System.out.println(myGradeBook.courseName);

        //quedé en 315, tengo que volverlo a hacer
        //hice el GradeBook2
    }
}
