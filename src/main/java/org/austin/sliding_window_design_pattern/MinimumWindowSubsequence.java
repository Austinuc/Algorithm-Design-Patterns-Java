package org.austin.sliding_window_design_pattern;

/**
 * Given strings str1 and str2, find the minimum (contiguous) substring subStr of str1,
 * such that every character of str2 appears in subStr in the same order as it is present in str2.
 *
 * If there is no window in str1 that covers all characters in str2, return an empty string.
 *
 * If there are multiple minimum-length windows, return the one with the leftmost starting index.
 */
public class MinimumWindowSubsequence {

    public static String solution(String str1, String str2) {
        String res = "";
        for (int i = 0, j = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
            }
        }
        return res;
    }
}
