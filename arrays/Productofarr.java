import java.util.Scanner;

public class Productofarr {
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] nums = new int[n];
    // intilize the array
    for(int i =0;i<n;i++){
        nums[i]=sc.nextInt();
    }
     int[] answer = productExceptSelf(nums);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

        sc.close();
    
    
 } 
 public static  int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Store left products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }   
}
