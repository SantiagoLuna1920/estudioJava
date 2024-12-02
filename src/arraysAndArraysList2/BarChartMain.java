package arraysAndArraysList2;

public class BarChartMain {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 }; //cantidad de asteriscos sucesivamente

        System.out.println("Grade distribution:");
        for ( int counter = 0; counter < array.length; counter++ ){
            if(counter == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", counter*10,counter*10+9);
            }

            for (int star = 0; star < array[counter]; star++)
                System.out.printf("*");

            System.out.println();
        }
    }
}
