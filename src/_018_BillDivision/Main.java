package _018_BillDivision;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum = -bill.get(k);
        for(Integer i : bill) {
            sum += i;
        }

        System.out.println(b == (sum/2) ? "Bon Appetit" : b-(sum/2));
    }
}
