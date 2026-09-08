import java.util.*;
class sum3{
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2 ; i++){
        int left = i+1;
        int right = nums.length-1;
        while(left<right)
        {
            int sum = nums[i] + nums[left]+ nums[right];
            if(sum==0)
            {
                res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }
            else if(sum<0)
            {
                left++;
            }
            else {
                right--;
            }
        }
        }
        return new ArrayList<> (res);
        
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        sum3 obj = new sum3();
        List<List<Integer>> result = obj.threeSum(nums);  
        System.out.println("Triplets who`s sum is 0");
        for(List<Integer> triplets : result){
            System.out.println("Triplets :"+triplets);
        }      
        

        
    }
}
