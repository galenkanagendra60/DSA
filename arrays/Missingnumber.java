import java.util.Scanner;;

public class Missingnumber {
    public static int missing(int[] nums)
    {
        int actualsum=0;
        for(int i=0;i<nums.length;i++)
        {
            actualsum+=nums[i];
        }
        int exceptedsum = nums.length *(nums.length +1)/2;

        int missing = exceptedsum - actualsum;
        return missing;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result = missing(nums);
        System.out.println("Result :"+result);

    }
}
