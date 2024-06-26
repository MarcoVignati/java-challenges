import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the word or phrase:");
        String input = scanner.nextLine();
        String inputNoSpaces = input.toLowerCase().replaceAll(" ", "").replaceAll("  ", "").trim();
        String invertedInput = "";

        for (int i = inputNoSpaces.length() - 1; i >= 0; i--) {
            invertedInput += inputNoSpaces.charAt(i);
        }

        if (inputNoSpaces.equals(invertedInput)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
