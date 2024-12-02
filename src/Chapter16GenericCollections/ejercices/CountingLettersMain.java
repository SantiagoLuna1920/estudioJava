package Chapter16GenericCollections.ejercices;

// Program counts the number of occurrences of each word in a String.
import java.util.*;

public class CountingLettersMain
{
public static void main(String[] args)
{
    Map<Character, Integer> myMap = new HashMap<>();
createMap(myMap); // create map based on user input
displayMap(myMap); // display map content
 }
 private static void createMap(Map<Character, Integer> map)
{
Scanner scanner = new Scanner(System.in); // create scanner
System.out.println("Enter a string:"); // prompt for user input
String input = scanner.nextLine();
 String letters = input.trim().toLowerCase().replaceAll("\\s+", "");
 char[] lettersArrayChar = letters.toCharArray();

for (char letter : lettersArrayChar)
 {

 if ( map.containsKey(letter)) // is word in map
{
    int count = map.get(letter);
    map.put(letter,count+1);
 }
else
    map.put(letter,1);
}
}
 private static void displayMap(Map<Character, Integer> map)
{
    Set<Character> keys = map.keySet();
 TreeSet<Character> sortedKeys = new TreeSet<>(keys);

System.out.printf("%nMap contains:%nKey\t\tValue%n");
for (Character key : sortedKeys)
 System.out.printf("%-10s%10s%n", key, map.get(key) );

System.out.printf(
"%nsize: %d%nisEmpty: %b%n",map.size() ,map.isEmpty() );
 }
} // end class CountingLettersMain
