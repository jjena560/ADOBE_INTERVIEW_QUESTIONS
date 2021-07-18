import java.util.*;
// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

// we'll do this as a recuesive sol, find out the smaller problem
public class Subsets {
    static

    public void generateSubsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> result) {
        result.add(new ArrayList<>(curr));
        for (int x : nums) {
            int n = result.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> r = new ArrayList<>(result.get(i));
                r.add(x);
                result.add(r);
            }

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<List<Integer>> subsets = new ArrayList<>();
        int[] nums = { 1, 2, 3 };
        generateSubsets(0, nums, new ArrayList<Integer>(), subsets);
    }

}
