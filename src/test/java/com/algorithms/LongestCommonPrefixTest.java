package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.algorithms.LongestCommonPrefix;

public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefixTest() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = { "flower", "flow", "flight" };
        String output = lcp.longestCommonPrefix(strs);
        assertEquals("fl", output);
    }
}
