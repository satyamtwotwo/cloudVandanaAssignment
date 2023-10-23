import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check for pangram:");
        String input = scanner.nextLine();
        boolean isPangram = checkIfPangram(input.toLowerCase());
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        if (input.length() < 26) {
            return false;
        }
        boolean[] mark = new boolean[26];
        int index;
        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
                mark[index] = true;
            }
        }
        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }
}
