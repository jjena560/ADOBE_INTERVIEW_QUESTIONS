import java.util.*;

// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Given two integers x and y, return the Hamming distance between them.

// Input: x = 1, y = 4
// Output: 2
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑

public class HammingDistancee {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        int res = 0;

        while (x > 0 || y > 0) {
            res += (x % 2) ^ (y % 2);
            x = x / 2;
            y = y / 2; // right shirt as 0 0 1 1 ->> 0 0 0 1
        }

        System.out.println(res);
    }
}
