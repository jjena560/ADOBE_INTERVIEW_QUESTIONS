import java.util.*;

// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String jewels = scn.next();
        String stones = scn.next();

        HashSet<Character> jew = new HashSet<Character>();
        int numJewels = 0;

        for (char c : jewels.toCharArray()) {
            jew.add(c);
        }

        for (char c : stones.toCharArray()) {
            if (jew.contains(c)) {
                numJewels++;
            }
        }

        System.out.println(numJewels);
    }
}
