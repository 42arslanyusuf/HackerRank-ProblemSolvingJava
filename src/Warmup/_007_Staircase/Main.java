package Warmup._007_Staircase;

public class Main {
    public static void main(String[] args) {
        
    }
	 public static void staircase(int n) {
    // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-(n-i); j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}