import java.util.Scanner;
public class SecoundLargest {
    public static int SecoundLargest(int[] nums)
    {
        int largest = Integer.MIN_VALUE;
        int Secoundlargest = Integer.MIN_VALUE;
        for(int num : nums)
        {
            if(num > largest)
            {
                Secoundlargest = largest;
                largest = num;
            }
            else if(num>Secoundlargest && num<largest)
            {
                Secoundlargest = num;
            }
        }
        return Secoundlargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result =SecoundLargest(nums);
        System.out.println("REsult :"+ result);

    }
    
}
