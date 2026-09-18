import java.util.*;


class LeaderinArray{
    public static ArrayList<Integer> leaderinarray(int[] nums)
    {
    ArrayList<Integer> leader = new ArrayList<>();
     
    int maxlength = nums[nums.length-1];
    leader.add(maxlength);
    for(int i=nums.length-2;i>0;i--)
    {
        if(nums[i]>maxlength)
        {
            maxlength = nums[i];
            leader.add(nums[i]);
        }
    }

    Collections.reverse(leader);
    return leader;
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        ArrayList<Integer> result = leaderinarray(nums);

        System.out.println("Leaders in the array:");
        System.out.println(result);

        sc.close();

    }
}