package Warmup._011_AppleAndOrange;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

/*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s homeStart
     *  2. INTEGER t homeEnd
     *  3. INTEGER a appleTreePoint
     *  4. INTEGER b orangeTreePoint
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        int appleCount = 0;
        int orangeCount = 0;
        
        for (int i = 0; i < apples.size(); i++) {
            apples.set(i, apples.get(i) + a);
            if (apples.get(i)>=s && apples.get(i)<=t) {
                appleCount++;
            }
        }
        
        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(i, oranges.get(i) + b);
            if (oranges.get(i)>=s && oranges.get(i)<=t) {
                orangeCount++;
            }
        }
        
        
        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

}