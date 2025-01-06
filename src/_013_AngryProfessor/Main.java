package _013_AngryProfessor;

import java.util.List;

public class Main {

}

class Result {
    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int attendance = 0;
        for(Integer e : a){
            if (e <= 0) attendance++;
        }

        return attendance >= k ? "NO" : "YES";
    }

}
