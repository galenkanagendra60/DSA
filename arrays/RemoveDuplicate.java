
import java.util.Scanner;

/**
 * RemoveDuplicate
 */
public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int result = removeDuplicates(nums);
        System.out.println("Result :" + result);
        sc.close();

    }
}