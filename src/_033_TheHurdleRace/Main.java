package _033_TheHurdleRace;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = 0;
        for (int h : height) {
            max = Math.max(h, max);
        }

        return Math.max(max - k, 0);
    }
}
