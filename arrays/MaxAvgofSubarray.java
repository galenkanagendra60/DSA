import java.util.*;

class MaxAvgofSubarray{
    public static double findMaxAverage(int[] nums, int k) {

        int sum =0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }

        int maxsum = sum ;

        for(int i=k;i<nums.length;i++)
        {
            sum = sum - nums[i-k] + nums[i];
            maxsum = Math.max(sum,maxsum);
        }

        return (double)  maxsum/k;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the k - size ");
        int k = sc.nextInt();

        double result = findMaxAverage(nums, k);

        System.out.println("MaxAvgofsum :"+result);


    }
}