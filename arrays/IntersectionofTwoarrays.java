import java.util.Scanner;
import java.util.Arrays;

public class IntersectionofTwoarrays {

    static class Solution {

        public static int[] intersection(int[] nums1, int[] nums2) {

            int[] temp = new int[nums1.length];
            int k = 0;

            for (int i = 0; i < nums1.length; i++) {

                for (int j = 0; j < nums2.length; j++) {

                    if (nums1[i] == nums2[j]) {

                        boolean alreadyexist = false;

                        // Check whether element already exists
                        for (int x = 0; x < k; x++) {

                            if (temp[x] == nums1[i]) {
                                alreadyexist = true;
                                break;
                            }
                        }

                        if (!alreadyexist) {
                            temp[k] = nums1[i];
                            k++;
                        }

                        break;
                    }
                }
            }

            // Create result array of exact size
            int[] result = new int[k];

            for (int i = 0; i < k; i++) {
                result[i] = temp[i];
            }

            return result;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size m:");
        int m = sc.nextInt();

        System.out.println("Enter the array elements of nums1:");
        int[] nums1 = new int[m];

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the size n:");
        int n = sc.nextInt();

        System.out.println("Enter the array elements of nums2:");
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] answer = Solution.intersection(nums1, nums2);

        System.out.println("Result: " + Arrays.toString(answer));

        sc.close();
    }
}