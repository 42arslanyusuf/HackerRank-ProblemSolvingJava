package _005_DiagonalDifference;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;
        int result = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            leftToRightDiagonal += arr.get(i).get(i);
        }
        
        for (int i = 0; i < arr.size(); i++) {
            rightToLeftDiagonal += arr.get(i).get(arr.size() - i - 1);
        }
        
        result = Math.abs(leftToRightDiagonal - rightToLeftDiagonal);
        return result;
    }
}