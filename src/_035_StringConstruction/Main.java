package _035_StringConstruction;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

    }

    public static int stringConstruction(String s) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        return characters.size();
    }
}
