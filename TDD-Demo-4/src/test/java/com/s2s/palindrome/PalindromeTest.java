package com.s2s.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test
    public void whenInputIsNullReturnZero() {
        assertEquals(0, Palindrome.isPalindrome(""));
    }

    @Test
    public void whenInputLengthIsZeroReturnZero() {
        assertEquals(0, Palindrome.isPalindrome(""));
    }

    @Test
    public void whenPalindromeOfTwoLettersThenAccept() {
        assertEquals(1, Palindrome.isPalindrome("oo"));
    }

    @Test
    public void whenPalindromeOfFourLettersThenAccept() {
        assertEquals(2, Palindrome.isPalindrome("noon"));
    }

    @Test
    public void whenPalindromeOfSevenLettersThenAccept() {
        assertEquals(3, Palindrome.isPalindrome("racecar"));
    }

    @Test
    public void fail() {
        assertEquals(0, Palindrome.isPalindrome("gdfgdgd"));
    }
}
