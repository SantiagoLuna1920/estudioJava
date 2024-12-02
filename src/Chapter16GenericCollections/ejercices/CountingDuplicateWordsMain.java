package Chapter16GenericCollections.ejercices;
import java.util.*;

public class CountingDuplicateWordsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        String words = input.trim().toLowerCase().replaceAll("[.,¿?]","");
        String[] wordsArray = words.split(" ");
        List<String> separatedWords = Arrays.asList(wordsArray);
        Set<String> duplicateWords = new HashSet<String>(separatedWords);

        Map<String, Integer> displayDuplicateWords = new HashMap<String, Integer>();

        for( String word : separatedWords ) {
            if( duplicateWords.contains(word) ) {
                if( displayDuplicateWords.containsKey(word) ){
                    int count = displayDuplicateWords.get(word);
                    displayDuplicateWords.put(word,count+1);
                } else{
                    displayDuplicateWords.put(word,1);
                }
            }
        }
        Set<String> displayWord = displayDuplicateWords.keySet();
        System.out.printf("%nMap contains:%nWord\t\t\tValue%n");
        for(String word : displayWord) {
            if( displayDuplicateWords.get(word) > 1 ) {
                System.out.printf("%-10s%10s%n", word, displayDuplicateWords.get(word) );
            }
        }
    }
}
