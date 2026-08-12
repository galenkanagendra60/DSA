import java.util.Scanner;

public class ReversethewordIII {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reverse = new StringBuilder(word);
            result.append(reverse.reverse()).append(" ");
        }
        return result.toString().trim();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        String res = reverseWords(s);
        System.out.println("result:" + res);
        sc.close();

    }
}
