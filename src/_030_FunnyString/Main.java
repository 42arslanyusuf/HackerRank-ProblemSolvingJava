package _030_FunnyString;

public class Main {
    public static void main(String[] args) {

    }

    public static String funnyStringOtherSolution(String s) {
        int[] sCharArray = new int[s.length()];
        int[] sReversedCharArray = new int[s.length()];

        int[] sAr = new int[s.length() - 1];
        int[] sReversedAr = new int[s.length() - 1];

        for (int i = 0; i < s.length(); i++) {
            sCharArray[i] = s.charAt(i);
            sReversedCharArray[i] = s.charAt(s.length() - i - 1);
        }

        for (int i = 0; i < sCharArray.length - 1; i++) {
            sAr[i] = Math.abs(sCharArray[i] - sCharArray[i + 1]);
            sReversedAr[i] = Math.abs(sReversedCharArray[i] - sReversedCharArray[i + 1]);
            if (sAr[i] != sReversedAr[i]) {
                return "Not Funny";
            }
        }

        return "Funny";
    }

    public static String funnyString(String s) {
        StringBuilder reverseS = new StringBuilder(s);
        reverseS.reverse();
        for (int i = 0; i < s.length() - 1; i++) {
            int a = Math.abs((int) (s.charAt(i)) - (int) (s.charAt(i + 1)));
            int b = Math.abs((int) (reverseS.charAt(i)) - (int) (reverseS.charAt(i + 1)));

            if (a != b) {
                return "Not Funny";
            }
        }

        return "Funny";
    }

}
