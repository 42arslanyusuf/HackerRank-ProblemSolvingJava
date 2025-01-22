package _020_DrawingBook;

public class Main {
    public static void main(String[] args) {

    }

    public static int pageCount(int n, int p) {
        // Write your code here
        int fromStart = p / 2;
        int fromLast = (n / 2) - fromStart;
        return Math.min(fromStart, fromLast);
    }
}
