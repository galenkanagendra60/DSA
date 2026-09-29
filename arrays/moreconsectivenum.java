import java.util.Scanner;

class moreconsectivenum {
    public static  int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0 ;
        int maxlen = 0 ;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zeros++;
            }

        while(zeros>k)
        {
            if(nums[left]==0)
            {
                zeros--;
            }
            left++;
        }

        maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: "); 
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the k value :");
        int k = sc.nextInt();
        int result = longestOnes(nums, k);
        System.out.println("Result:"+result);
    }
}