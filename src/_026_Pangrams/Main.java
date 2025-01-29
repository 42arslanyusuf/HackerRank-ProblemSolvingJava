package _026_Pangrams;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }

    public static String pangrams(String s) {
        // Write your code here
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        Set<Character> characterSet = new HashSet<>();

        char[] newSCharArray = s.replace(" ", "").toLowerCase().trim().toCharArray();

        for (char c : newSCharArray) {
            characterSet.add(c);
        }

        alphabet.removeAll(characterSet);

        return alphabet.isEmpty() ? "pangram " : "not pangram";
    }
}
