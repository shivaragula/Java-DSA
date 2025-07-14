import java.util.Scanner;

public class SocksBuySell {

    public static int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}
