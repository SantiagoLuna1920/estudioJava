package lambdasAndStreams17.streamStringManipulations;

import java.util.Arrays;
import java.util.List;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        //display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        //string in upperCase
        List<String> stringInUpperCase = Arrays.stream(strings)
                .map(String::toUpperCase).toList();

        System.out.printf("strings in uppercase: %s%n", stringInUpperCase);
    }
}
