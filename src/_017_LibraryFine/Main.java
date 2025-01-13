package _017_LibraryFine;

public class Main {
    public static void main(String[] args) {

    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int result = 0;

        if (y1 > y2) result = 10000;
        else if (m1 > m2 && y1 == y2) result = (m1 - m2) * 500;
        else if (d1 > d2 && y1 == y2 && m2 == m1) result = (d1 - d2) * 15;

        return result;
    }
}
