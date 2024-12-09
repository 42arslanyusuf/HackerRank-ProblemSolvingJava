package Warmup._006_PlusMinus;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

	public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double countPositive = 0;
        double countNegative = 0;
        double countZero = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                countPositive += 1;
            } else if (arr.get(i) < 0) {
                countNegative++;
            } else {
                countZero++;
            }        
        }
        
        double positiveRation = countPositive / arr.size();
        double negativeRation = countNegative / arr.size();
        double zeroRation = countZero / arr.size();
        
        System.out.printf("%1.6f%n", positiveRation);
        System.out.printf("%1.6f%n", negativeRation);
        System.out.printf("%1.6f%n", zeroRation);
    }
}