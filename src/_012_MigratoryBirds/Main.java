package _012_MigratoryBirds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirdsOLD(List<Integer> arr) {
        // Write your code here
        List<Integer> typeBirdsCount = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            typeBirdsCount.add(0);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) typeBirdsCount.set(0, typeBirdsCount.get(0) + 1);
            else if (arr.get(i) == 2) typeBirdsCount.set(1, typeBirdsCount.get(1) + 1);
            else if (arr.get(i) == 3) typeBirdsCount.set(2, typeBirdsCount.get(2) + 1);
            else if (arr.get(i) == 4) typeBirdsCount.set(3, typeBirdsCount.get(3) + 1);
            else if (arr.get(i) == 5) typeBirdsCount.set(4, typeBirdsCount.get(4) + 1);
        }

        int max = 0;
        int index = -1;
        for (int i = 0; i < typeBirdsCount.size(); i++) {
            if (max < typeBirdsCount.get(i)) {
                max = typeBirdsCount.get(i);
                index = typeBirdsCount.indexOf(max);
            }
        }

        return index + 1;
    }


    public static int migratoryBirds(List<Integer> arr) {
        List<Integer> typeBirdsCount = new ArrayList<>(Collections.nCopies(5, 0));

        for (int birdType : arr) {
            typeBirdsCount.set(birdType - 1, typeBirdsCount.get(birdType - 1) + 1);
        }

        int maxCount = 0;
        int mostFrequentType = 0;
        for (int i = 0; i < typeBirdsCount.size(); i++) {
            if (typeBirdsCount.get(i) > maxCount) {
                maxCount = typeBirdsCount.get(i);
                mostFrequentType = i + 1;
            }
        }

        return mostFrequentType;
    }


}
