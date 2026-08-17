import java.util.Scanner;

public class MovesZero {

    public static void moveZeroes(int[] nums) {

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.println("Result:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}