package org.austin.sliding_window_design_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array and a window of size w,
 * find the current maximum value in the window as it slides through the entire array.
 *
 */
public class MaximumSlidingWindow {
    public static List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

    public static Integer solution(List<Integer> nums, Integer w) {
        Integer max = 0, sum = 0;

        for (int i = 0, j = 0; i< nums.size(); i++) {

            while ((i - j) < w) {
                max = Math.max(nums.get(i), max);
                sum += nums.get(i++);
            }
            i--;
            sum -= nums.get(j++);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(arr,3));
    }
}
