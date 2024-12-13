package Warmup._009_BirthdayCakeCandles;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        List<Integer> sortedList = candles;
        Collections.sort(sortedList);
        int maxHeightOfCandles = sortedList.get(sortedList.size() - 1);
        int numberOfMaxHeight = 0;
        for (Integer i : sortedList) {
            if (i == maxHeightOfCandles) {
                numberOfMaxHeight++;
            }
        }
        
        return numberOfMaxHeight;
    }
}