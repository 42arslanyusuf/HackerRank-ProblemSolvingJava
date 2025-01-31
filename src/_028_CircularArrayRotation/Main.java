package _028_CircularArrayRotation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> rotatedList = new ArrayList<>(a);
        List<Integer> result = new ArrayList<>();

        int lastIndex = rotatedList.size() - 1;

        for (int i = 0; i < k; i++) {
            Integer last = rotatedList.get(lastIndex);
            rotatedList.remove(lastIndex);
            rotatedList.add(0, last);
        }

        for (int i = 0; i < queries.size(); i++) {
            result.add(rotatedList.get(queries.get(i)));
        }

        return result;
    }
}
