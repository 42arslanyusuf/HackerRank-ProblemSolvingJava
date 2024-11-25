package Warmup._001_CompareTheTriplets;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> points  =new ArrayList<>();
        points.add(0);
        points.add(0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                points.set(0, points.get(0)+1);
            }
            if (b.get(i) > a.get(i)) {
                points.set(1, points.get(1)+1);
            }
        }

        return points;
    }
}

