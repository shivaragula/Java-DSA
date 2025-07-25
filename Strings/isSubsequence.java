package Strings;
import java.util.Scanner;

public class isSubsequence {
    public static boolean checkSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;

        int i = 0, j = 0;
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean result = checkSubsequence(s, t);
        System.out.println(result);
    }
}
