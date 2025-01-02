package _008_MiniMaxSum;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        List<Integer> sortedList = arr;
        Collections.sort(sortedList);
        // bir çok int değişkeninin değerlerinin toplamı int veri tipini aşabileceğinden dolayı long tanımlandı
        long max = 0;
        long min = 0;
        
        for(int i=1; i<sortedList.size(); i++){
            max += sortedList.get(i);
        }
        for(int i=0; i<sortedList.size()-1; i++){
            min += sortedList.get(i);
            
        }
        System.out.println(min+" "+max);
    }
}