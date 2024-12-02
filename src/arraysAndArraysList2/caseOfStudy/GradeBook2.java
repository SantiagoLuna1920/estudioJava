package arraysAndArraysList2.caseOfStudy;

public class GradeBook2 {
    public final String courseName;
    private final int[] grades;

    public GradeBook2( String courseName, int[] grades ) {
        this.courseName = courseName;
        this.grades = grades;
    }

    //process grades
    public void processGrades() {
        getGradesStudents();
        System.out.println("Class average is " + getAverageGrade());
        System.out.println("Lowest grade is " + getMinimumGrade());
        System.out.println("Highest grade is " + getMaximumGrade());
        getGradeDistribution();
    }

    public String getCourseName() {
        return courseName;
    }

    //getMaximum grade
    public int getMaximumGrade() {
        int highGrade = grades[0];
        for( int grade : grades )
            if( grade > highGrade )
                highGrade = grade;

        return highGrade;
    }

    //getMinimum grade
    public int getMinimumGrade() {
        int lowGrade = grades[0];
        for( int grade : grades )
            if( grade < lowGrade )
                lowGrade = grade;

        return lowGrade;
    }

    //average of the grades
    public double getAverageGrade(){
        double total = 0;
        for( int grade : grades )
            total += grade;

        return total / grades.length;
    }

    public void getGradesStudents() {
        System.out.println("The grades are:");
        for( int student = 0; student < grades.length; student++ )
            System.out.printf("Student %d: %d\n", student + 1, grades[student] );
    }

    private void getGradeDistribution() {
        int[] frequency = new int[11];
        System.out.println("Grade distribution:");

        for( int grade : grades )//10, 10, 100
            ++frequency[grade/10];//1, 1, 10

        for( int distribution = 0; distribution < frequency.length; distribution++ ){
            if( distribution==10 ){
                System.out.printf("100: ");
            } else {
                System.out.printf("%d-%d: ", distribution*10, distribution*10+9 );
            }
            for (int star = 0; star < frequency[distribution]; star++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
