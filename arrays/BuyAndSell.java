
import java.util.Scanner;

public class BuyAndSell {
    public static int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            minprice = Math.min(minprice, prices[i]);

            int profit = prices[i] - minprice;

            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size  :");
        int size = sc.nextInt();
        System.out.println("enter the array elements :");
        int[] prices = new int[size];
        for (int i = 0; i < size; i++) {
            prices[i] = sc.nextInt();
        }
        int result = maxProfit(prices);
        System.out.println("Result :" + result);

    }
}
