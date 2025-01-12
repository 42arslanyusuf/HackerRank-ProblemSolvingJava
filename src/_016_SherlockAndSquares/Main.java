package _016_SherlockAndSquares;

public class Main {
    public static void main(String[] args) {

    }

    public static int squares(int a, int b) {
        // Write your code here
        int count = 0;
        double number = Math.ceil(Math.sqrt(a));
        while(Math.pow(number,2) <= b){
            number = Math.pow(number, 2);
            number = Math.sqrt(number) + 1;
            count++;
        }

        return count;
    }
}
