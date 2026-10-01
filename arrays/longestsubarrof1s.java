import java.util.Scanner;

class longestsubarrof1s {
    public static int longestSubarray(int[] nums) {

        int left = 0;
        int zeros = 0;
        int maxlen = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            maxlen = Math.max(maxlen, right - left);
        }
        return maxlen;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = longestSubarray(nums);
        System.out.println("Result " + result);
    }
}