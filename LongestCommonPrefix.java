// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        int index = 0;
        String longestCommonPrefix = "";

        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (c != strs[i].charAt(index) || index >= strs[i].length()) {
                    System.out.println(longestCommonPrefix);
                    return;
                }
            }

            longestCommonPrefix += c;
            index++;
        }
        System.out.println(longestCommonPrefix);
    }
}
