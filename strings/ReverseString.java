import java.util.Scanner;

public class ReverseString {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                String s = sc.nextLine();
                
                String result = reverseWords(s);
                
                System.out.println(result);
            }
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder reverse = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);

            if (i > 0) {
                reverse.append(" ");
            }
        }

        return reverse.toString();
    }
}