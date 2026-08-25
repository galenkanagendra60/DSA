import java.util.Scanner;

class PerfectSquare {
    public static boolean perfectsquare(int n) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            long Square = (long) mid * mid;
            if (Square == n) {
                return true;
            } else if (Square < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.print(perfectsquare(n));
    }

}