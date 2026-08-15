import java.util.Scanner;

class MergeSort {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {

            if (nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }

            p3--;
        }

        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of nums1:");
        int m = sc.nextInt();

        System.out.println("Enter the size of nums2:");
        int n = sc.nextInt();

        // nums1 needs space for both arrays
        int[] nums1 = new int[m + n];

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged array:");

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}