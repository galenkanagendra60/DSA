import java.util.PriorityQueue;
import java.util.Scanner;

class KthElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int num : nums) {
            min.add(num);
            if (min.size() > k) {
                min.poll();
            }
        }
        return min.peek();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the kth element :");
        int k = sc.nextInt();
        int result = findKthLargest(nums, k);
        System.out.println("Result :" + result);

    }
}