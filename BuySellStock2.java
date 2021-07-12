import java.util.*;

public class BuySellStock2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // total no. of days
        int[] prices = new int[n]; // prices of ith day

        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }

        // prices = [7,1,5,3,6,4]
        int bd = 0;
        int sd = 0; // selling date
        int profit = 0;

        for (int j = 1; j < prices.length; j++) {
            if (prices[j] < prices[j - 1]) {
                profit += prices[sd] - prices[bd];
                sd = bd = j;
            } else {
                sd = j;
            }
        }

        profit += prices[sd] - prices[bd];

        System.out.println(profit);

    }
}
