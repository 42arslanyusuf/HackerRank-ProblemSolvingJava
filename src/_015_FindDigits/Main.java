package _015_FindDigits;

public class Main {
    public static void main(String[] args) {

    }

    public static int findDigits(int n) {
        int count = 0;

        int num = n;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0 && num % lastDigit == 0) {
                count++;
            }
            n = n / 10;
        }

        return count;
    }


}
