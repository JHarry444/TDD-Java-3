package com.s2s.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @Test
    public void when_imputLength_is_zero_then_accept() {
        Palindrome palindromeTester = new Palindrome();
        //assertTrue(palindromeTester.isPalindrome(""));
        assertEquals(1, palindromeTester.isPalindrome(""));
    }

    @Test
    public void when_palindrome_of_two_letters_then_accept() {
        Palindrome palindromeTester = new Palindrome();
//        assertTrue(palindromeTester.isPalindrome("noon"));
        assertEquals(1, palindromeTester.isPalindrome("oo"));
    }

    @Test
    public void when_palindrome_of_four_letters_then_accept() {
        Palindrome palindromeTester = new Palindrome();
//        assertTrue(palindromeTester.isPalindrome("noon"));
        assertEquals(2, palindromeTester.isPalindrome("noon"));
    }

    @Test
    public void when_palindrome_of_six_letters_then_accept() {
        Palindrome palindromeTester = new Palindrome();
//        assertTrue(palindromeTester.isPalindrome("noon"));
        assertEquals(3, palindromeTester.isPalindrome("snoons"));
    }
}
