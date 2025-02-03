package _031_ExtraLongFactorials;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger bi = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }

        System.out.println(bi);
    }
}
