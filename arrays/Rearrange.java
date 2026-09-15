import java.util.Scanner;
class Rearrange{
    public static int[] rearrange(int[] nums)
    {
        int[] result = new int[nums.length];
        int pos =0;
        int neg = 1;
        for(int num :nums)
        {
            if(num>0)
            {
               result[pos]= num;
               pos+=2;    
            }
            else if(num<0)
            {
                result[neg] = num;
                neg+=2;
            }
        }
        return result;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] result = rearrange(nums);
        
        for(int j=0;j<result.length;j+=2)
        {
            System.out.println(result[j]+" "+result[j+1]);
        }
    }
}