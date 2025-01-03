package com.algorithms;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String firstStr = strs[0];
        int n = strs[0].length();

        for (int i = 0; i < n; i++) {
            char c = firstStr.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != c) {
                    return strs[j].substring(0, i);
                }
            }
        }
        return firstStr;
    }

}
