
import java.util.*;




class sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 3 ;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<nums.length - 2 ;j++)
            {
                if(j>i+1&& nums[j]== nums[j-1])
                {
                    continue;
                }
            
            int left = j+1;
            int right = nums.length-1;
            while(left < right ){
                long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                if(sum== target)
                {
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    while(left<right && nums[left] == nums[left+1])
                    {
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1])
                    {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<target)
                {
                    left++;
                }
                else{
                    right--;
                }
            }
            }
        } 
        return result; 
        
    }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array :");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the array elements :");
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=sc.nextInt();
            }
            System.out.println("Enter the target");
            int target = sc.nextInt();

            sum4 obj= new sum4();
            List<List<Integer>>  result = obj.fourSum(nums, target);
            System.out.println("four sum result :");
            System.out.println(result);


        }
    
}