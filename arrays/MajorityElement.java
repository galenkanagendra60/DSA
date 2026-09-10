import java.util.Scanner;
class MajorityElement {
    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[] nums = new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result = majorityElement(nums);
        System.out.println("Result :"+result);

    }
}