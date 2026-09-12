import java.util.Scanner;

class SortedandRotate {
    public static boolean check(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        boolean result = check(nums);
        System.out.println("Result :"+result);

    }
}