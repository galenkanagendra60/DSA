import java.util.Scanner;
import java.math.*;

public class longestsubarray {
    public static int longestsubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxlength = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                int length = right - left + 1;
                maxlength = Math.max(maxlength, length);
            }
        }

        return maxlength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the k value :");
        int k = sc.nextInt();

        int result = longestsubarray(nums, k);
        System.out.println("Result:" + result);

    }

}
