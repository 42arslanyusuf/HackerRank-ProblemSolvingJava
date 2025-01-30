package _027_UtopianTree;

public class Main {
    public static void main(String[] args) {

    }

    public static int utopianTree(int n) {
        // Write your code here
        int result = 1;

        for(int i = 1; i<=n; i++){
            if(i % 2 == 1){
                result *= 2;
            } else {
                result += 1;
            }
        }

        return result;
    }
}
