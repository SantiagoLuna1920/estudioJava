package arraysAndArraysList2.caseOfStudy;

public class GradeBookDimensional {
    private final String courseName;
    private final int[][] grades;

    public GradeBookDimensional( String courseName, int[][] grades ) {
        this.courseName = courseName;
        this.grades = grades;
    }

    //process grades
    public void processGrades() {
        getGradesStudents();
        System.out.println("Lowest grade is " + getMinimumGrade());
        System.out.println("Highest grade is " + getMaximumGrade());
        getGradeDistribution();
    }

    public String getCourseName() {
        return courseName;
    }

    //getMaximum grade
    public int getMaximumGrade() {
        int highGrade = grades[0][0];

        for( int row = 0; row < grades.length; row++ ) {
            for( int columns = 0; columns < grades[ row ].length; columns++ ){
                if( grades[ row ][ columns ] > highGrade  )
                    highGrade = grades[ row ][ columns ];
            }
        }


        return highGrade;
    }

    //getMinimum grade
    public int getMinimumGrade() {
        int lowGrade = grades[0][0];
        for( int row = 0; row < grades.length; row++ ) {
            for( int columns = 0; columns < grades[ row ].length; columns++ ){
                if( grades[ row ][ columns ] < lowGrade  )
                    lowGrade = grades[ row ][ columns ];
            }
        }

        return lowGrade;
    }

    //average of the grades
    public double getAverageGrade(int student){
        double total = 0;

        for( int grade = 0; grade < grades[ student ].length; grade++) {
            total += grades[ student ][ grade ];
        }

        return total / grades[student].length;
    }

    public void getGradesStudents() {
        System.out.println("The grades are:");
        for( int student = 0; student < grades.length; student++ ) {
            System.out.printf("Student %d: ", student + 1);
            for (int grade = 0; grade < grades[student].length; grade++){
                System.out.printf("   %d", grades[student][grade]);
            }
            System.out.printf("   %f",getAverageGrade(student));
            System.out.println();
        }
    }

    public void getGradeDistribution() {
        int[] frequency = new int[11];

        System.out.println("Grade distribution:");

        for( int row = 0; row < grades.length; row++ ) {
            for( int columns = 0; columns < grades[row].length; columns++ ) {
                ++frequency[ grades[row][columns]/10 ];
            }
        }

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
