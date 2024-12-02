package arraysAndArraysList2.caseOfStudy;

public class GradeBook {
    private String courseName;
    private int[] grades;

    //constructor
    public GradeBook( String courseName, int[] grades ) {
        this.courseName = courseName;
        this.grades = grades;
    }

    //method to set the course name
    public void setCourseName( String courseName ) {
        this.courseName = courseName;
    }

    //method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }

    //perform various operations on the data
    public void processGrades() {

        outputGrades();
        System.out.printf("%nClass average is %.2f%n",getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMinimum(),getMaximum());
        outputBarChart();

    }

    //find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0];

        for( int grade : grades ){
            if( grade < lowGrade )
                lowGrade = grade;
        }
        return lowGrade;
    }

    //find maximum grade
    public int getMaximum() {
        int highGrade = grades[0];

        for( int grade : grades ) {
            if( grade > highGrade )
                highGrade = grade;
        }
        return highGrade;
    }

    //determine averade grade for test
    public double getAverage() {
        double total = 0;
        for( int grade : grades )
            total += grade;

        return total / grades.length;
    }

    //output bar chart displaying grade distribution
    public void outputBarChart() {
        System.out.println("Grade distribution:");

        int[] frequency = new int[11];

        for ( int grade : grades )
            ++frequency[ grade/10 ];

        for( int count = 0; count<frequency.length; count++ ) {
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
            System.out.printf("%02d-%02d: ",
                    count * 10, count * 10 + 9);

            for( int stars = 0; stars < frequency[count]; stars++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades(  ){
        System.out.printf("The grades are:%n%n");

        for( int student = 0; student < grades.length; student++ ) {
            System.out.printf("Student %2d: %3d%n",student+1,grades[student]);
        }
    }
}
