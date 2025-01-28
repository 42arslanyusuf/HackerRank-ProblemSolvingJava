package _025_CamelCase;

public class Main {
    public static void main(String[] args) {

    }

    public static int camelcase(String s) {
        int count = 1;
        char[] ch = s.toCharArray();
        for(char c: ch){
            if(Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
