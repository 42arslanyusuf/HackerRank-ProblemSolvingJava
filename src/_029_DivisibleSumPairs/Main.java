package _029_DivisibleSumPairs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 6; // dizi eleman sayısı
        int k = 3; // toplanılan iki sayının tam bölen sayı
        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);

        System.out.println(divisibleSumPairs(n, k, ar));

    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;

        for (int i = 0; i < n; i++) {
            int number1 = ar.get(i);
            for (int j = i + 1; j < n; j++) {
                if ((number1 + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }

}
