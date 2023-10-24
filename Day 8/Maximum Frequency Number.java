// You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
// If two or more elements are having the maximum frequency, return the element which occurs in the array first.

import java.util.*;

public class Solution {

    public static int maxFrequencyNumber(int[] arr) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int ele : arr) {
            if (map.get(ele) > max) {
                max = map.get(ele);
                ans = ele;
            }
        }
        return ans;
    }
}
