public class Main {
    public static void main(String[] args) {
        
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long total = 0;
        for (int i = 0; i < ar.size(); i++) {
            total += ar.get(i);
        }
        
        return total;
    }
}