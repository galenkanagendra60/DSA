import java.util.Scanner;

class SearchinsertPos {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int size = sc.nextInt();
        System.out.println("enter the target :");
        int target = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter the array elements :");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int result = searchInsert(nums, target);
        System.out.println("Result :" + result);

    }
}