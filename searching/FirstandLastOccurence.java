import java.util.Scanner;
import java.util.Arrays;

public class FirstandLastOccurence {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target :");
        int target = sc.nextInt();
        int[] result = searchRange(nums, target);
        System.out.println("Result :" + Arrays.toString(result));

    }
}
