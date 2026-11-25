package com.algorithmicjourney.arraysandhashing;

import java.util.*;

/**
 * Problem: Contains Duplicate
 * Source: https://neetcode.io/problems/duplicate-integer
 * <p>
 * Approach: Use a HashSet to track seen numbers. If a number already exists, return true.
 * <p>
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

    // HashSet   ***
    // Time  - O(n), Space - O(n)
    public boolean hasDuplicate_3(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (seen.contains(element)) {
                return true;
            }
            seen.add(element);
        }
        return false;
    }

    // Brute-force
    // Time  - O(n), Space - O(n)
    public boolean hasDuplicate_1(int[] nums) {

        if (nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // Sorting
    // Time  - O(nlogn), Space - O(1) or O(n) - based on sorting algorithm
    public boolean hasDuplicate_2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }


    // HashSet Length
    // Time  - O(n), Space - O(n) - based on sorting algorithm
    public boolean hasDuplicate_4(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        System.out.println(solution.hasDuplicate_4(new int[]{1, 2, 3, 1})); // true
        System.out.println(solution.hasDuplicate_4(new int[]{1, 2, 3, 4})); // false
        System.out.println(solution.hasDuplicate_4(new int[]{})); // false
    }
}
