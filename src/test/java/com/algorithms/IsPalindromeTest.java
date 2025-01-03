package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.algorithms.IsPalindrome;

public class IsPalindromeTest {
    @Test
    public void isPalindromeTest() {
        IsPalindrome ip = new IsPalindrome();
        int x = 121;
        boolean output = ip.isPalindrome(x);
        assertEquals(true, output);
    }
}
