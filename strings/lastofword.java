import java.util.Scanner;

public class lastofword {

    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        // Skip spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        int count = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string :");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);
        System.out.println("result :" + result);
        sc.close();
    }
}
