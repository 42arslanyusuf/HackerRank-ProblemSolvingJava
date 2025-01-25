package _022_CaesarCipher;

public class Main {
    public static void main(String[] args) {

    }

    public static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();
        // 65 is ASCII for 'A'
        // 97 is ACII for 'a'
        // 26 is number of letters in the English alphabet
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
                char newChar = (char)(((int) c + k - 65) % 26 + 65);
                result.append(newChar);
            } else if(Character.isLowerCase(c)){
                char newChar = (char)(((int)c + k - 97) % 26 + 97);
                result.append(newChar);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
