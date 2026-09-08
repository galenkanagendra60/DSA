import java.math.*;
import java.util.Arrays;
import java.util.Scanner;


class Sum3closest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0 ; i<nums.length-2 ; i++)
        {
            int left = i+1;
            int right = nums.length-1;
            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum - target)< Math.abs(closest - target))
                {
                    closest = sum;
                }
                else if(sum < target)
                {
                    left++;
                }
                else if(sum>target)
                {
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return closest;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size  :");
    int n = sc.nextInt();
    System.out.println("Enter the array elements :");
    int[] nums = new int[n];
    for(int i=0;i<n;i++)
    {
        nums[i] = sc.nextInt();
    }
    System.out.println("Enter the target  :");
    int target = sc.nextInt();
    
    int result = threeSumClosest(nums,target);
    System.out.println("Result :"+result);
    }
}