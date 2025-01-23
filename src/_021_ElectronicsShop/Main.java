package _021_ElectronicsShop;

public class Main {
    public static void main(String[] args) {

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int resultSum = -1;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                int sum = keyboards[i] + drives[j];
                if(sum <= b && sum >resultSum) resultSum = sum;
            }
        }
        return resultSum;
    }

}
