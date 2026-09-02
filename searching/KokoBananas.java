import java.util.Scanner;

class KokoBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int answer = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }
            if (hours <= h) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        System.out.println("Enter the number of hours :");
        int h = sc.nextInt();

        int result = minEatingSpeed(piles, h);
        System.out.println("Result :" + result);
    }
}