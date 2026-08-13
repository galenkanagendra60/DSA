import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  :");
        int size = sc.nextInt();
        System.out.println("Enter the variable to remove : ");
        int var = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the numbers in arrays :");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int result = removeElement(nums, var);
        System.out.println("result :" + result);
    }

}
