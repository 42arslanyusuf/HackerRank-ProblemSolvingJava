package _036_NumberLineJumps;

public class Main {
    public static void main(String[] args) {

    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String result = "NO";
        if (v1 > v2) {
            while (x1 <= x2) {
                if (x1 == x2) {
                    result = "YES";
                    break;
                } else {
                    x1 = x1 + v1;
                    x2 += x2 + v2;
                }
            }
        }

        return result;
    }
}
