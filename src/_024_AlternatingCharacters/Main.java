package _024_AlternatingCharacters;

public class Main {
    public static void main(String[] args) {

    }

    public static int alternatingCharacters(String s) {
        int deletedCount = 0;
        for(int i=0; i< s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                deletedCount++;
            }
        }

        return deletedCount;
    }
}
