import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofArrayII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }

        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size of nums1 :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements of nums1 :");
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array nums2:");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for (int j = 0; j < m; j++) {
            nums2[j] = sc.nextInt();
        }

        IntersectionofArrayII obj = new IntersectionofArrayII();
        int[] answer = obj.intersect(nums1, nums2);
        System.out.println("Intersection of an array :");
        for (int num : answer) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}
