
package Strings;
import java.util.Scanner;
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if(haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        Solution sol = new Solution();
        int index = sol.strStr(haystack, needle);
        System.out.println(index);
    }
}
