import java.util.Scanner;

public class LengthOfWord {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        LengthOfWord obj = new LengthOfWord();
        int result = obj.lengthOfLastWord(input);

        System.out.println("Length of the last word: " + result);
    }
}
