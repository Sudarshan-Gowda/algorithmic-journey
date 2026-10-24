package com.algorithmicjourney.arraysandhashing;

import java.util.HashSet;

/**
 * Problem: Contains Duplicate
 * Source: https://neetcode.io/problems/duplicate-integer
 *
 * Approach: Use a HashSet to track seen numbers. If a number already exists, return true.
 *
 * Time:  O(n)
 * Space: O(n)
 */
public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        System.out.println(solution.hasDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(solution.hasDuplicate(new int[]{1, 2, 3, 4})); // false
    }
}
