package _014_BeautifulDaysAtTheMovies;

public class Main {
    public static void main(String[] args) {

    }

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (; i <= j; i++) {
            if (Math.abs(i - reverseNumberAsString(i)) % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static int reverseNumberAsString(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

}
