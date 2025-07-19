package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roman Numeral: ");
        String input = scanner.nextLine().toUpperCase(); // to handle lowercase input
        RomanToInteger sol = new RomanToInteger();
        int result = sol.romanToInt(input);
        System.out.println("Integer value: " + result);
    }
}