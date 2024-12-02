package Chapter16GenericCollections.ejercices;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CopyingAndReversingLinkedListMain {
    public static void main(String[] args) {
        Character[] characters = {'c','a','r','a','c','t','e','r','e','s'};
        LinkedList<Character> characterList = new LinkedList<Character>(Arrays.asList(characters));
        Character[] characterListCopy = new Character[characterList.size()];
        LinkedList<Character> copycharacterList = new LinkedList<Character>(Arrays.asList(characterListCopy));
        Collections.copy(copycharacterList,characterList);

        System.out.println(characterList);
        Collections.reverse(copycharacterList);
        System.out.println(copycharacterList);
    }
}
