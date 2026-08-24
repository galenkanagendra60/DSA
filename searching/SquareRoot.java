import java.util.Scanner;

public class SquareRoot {
    public static int squareRoot(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (mid <= n / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square root = " + squareRoot(n));
    }
}