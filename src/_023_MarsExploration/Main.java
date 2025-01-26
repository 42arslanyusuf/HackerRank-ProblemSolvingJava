package _023_MarsExploration;

public class Main {
    public static void main(String[] args) {

    }

    public static int marsExploration(String s) {
        int count = 0;
        for(int i = 0; i< s.length(); i+=3){
            if(s.charAt(i) != 'S') count++;
            if(s.charAt(i+1) != 'O') count++;
            if(s.charAt(i+2) != 'S') count++;
        }
        return count;
    }
}
