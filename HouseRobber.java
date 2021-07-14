import java.util.*;

// You are a professional robber planning to rob houses along a street.Each house has a certain amount of money 
// stashed,the only constraint stopping you from robbing each of them is that adjacent houses have security systems 
// connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house,return the maximum amount of money 
// you can rob tonight without alerting the police.

public class HouseRobber {
    public static int main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // money in the houses

        int[] houses = new int[n];
        for (int i = 0; i < n; i++) {
            houses[n] = scn.nextInt();
        }

        int[] dp = new int[n];

        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + houses[i], dp[i - 1]);
        }

        return dp[n - 1];

    }
}
