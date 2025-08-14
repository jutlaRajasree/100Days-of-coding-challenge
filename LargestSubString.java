package com.palle;
import java.util.HashSet;
import java.util.Set;

public class LargestSubString {




    public static String largestSubstringNoRepetition(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        String maxSubstring = "";
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                maxSubstring = s.substring(left, right + 1);
            }
        }
        return maxSubstring;
    }

    public static void main(String[] args) {
        String s = "abcabcbbabcde";
        System.out.println(largestSubstringNoRepetition(s)); // Output: "abc"
    }
}
