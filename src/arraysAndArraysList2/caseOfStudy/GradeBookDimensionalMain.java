package arraysAndArraysList2.caseOfStudy;

public class GradeBookDimensionalMain {
    public static void main(String[] args) {
        int[][] gradesArray = {{0, 87, 96, 70},{68, 87, 90}, {40, 94, 100, 90},{100, 81, 82}, {83, 65, 85}, {78, 87, 65, 76}, {85, 75, 83}, {91,0, 94, 100},{76, 72, 84},{87, 93, 73}};
        GradeBookDimensional myGradeBook = new GradeBookDimensional( "CS101 Introduction to Java Programming",gradesArray);
        myGradeBook.processGrades();
    } // voy en repaso java de lo que he hecho, en classAndObjects3
}
