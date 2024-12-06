package Warmup._003_SimpleArraySum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

    public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
        int total = 0;
        for (Integer i : ar) {
            total += i;
        }
        
        return total;
    }
}