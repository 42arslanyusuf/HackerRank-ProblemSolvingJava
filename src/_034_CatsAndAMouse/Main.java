package _034_CatsAndAMouse;

public class Main {
    public static void main(String[] args) {

    }

    static String catAndMouse(int x, int y, int z) {
        int catADistanceFromMouse = Math.abs(x - z);
        int catBDistanceFromMouse = Math.abs(y - z);
        if (catADistanceFromMouse > catBDistanceFromMouse) return "Cat B";
        else if (catBDistanceFromMouse > catADistanceFromMouse) return "Cat A";
        return "Mouse C";
    }
}
