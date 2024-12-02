package Chapter16GenericCollections.ejercices;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;

public class InsertingElementsInALinkedListInSortedOrderMain {
    public static void main(String[] args) {
        LinkedList<Integer> listRandomNumbers = new LinkedList<Integer>();

        assignRandomNumbersInLinkedList(listRandomNumbers);
        printSortElements(listRandomNumbers);
        sumAndAverage(listRandomNumbers);
    }

    public static void assignRandomNumbersInLinkedList(LinkedList<Integer> list) {
        SecureRandom randomNumbers = new SecureRandom();
        int minNumber = 0;
        int maxNumber = 100;
        for(int i = 0; i<25; i++){
            int random = randomNumbers.nextInt((maxNumber - minNumber)+1) + minNumber;
            list.add(random);
        }
        Collections.shuffle(list);
    }

    public static void printSortElements(LinkedList<Integer> list) {
        Collections.sort(list);
        System.out.println("Sorted elements:");
        for(Integer number : list) {
            System.out.printf("%d  ",number);
        }
        System.out.println();
    }

    public static void sumAndAverage(LinkedList<Integer> list) {
        int sum = 0;
        for( Integer number : list ) sum += number;

        System.out.printf("Sum of elements in List is: %d",sum);
        average(list, sum);
    }

    public static void average(LinkedList<Integer> list, int sum) {
        float average = (float) sum/list.size();
        System.out.printf("\nAverage of elements in list is: %.2f",average);
    }
}
