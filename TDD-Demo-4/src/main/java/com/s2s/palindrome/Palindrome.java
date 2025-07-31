package com.s2s.palindrome;

public class Palindrome {

    public static int isPalindrome(String inputString) {
        int result = 0;
        if (!(inputString == null || inputString.isEmpty())) {
            char[] letters = inputString.toCharArray();

            for (int i = 0; i < letters.length / 2; i++) {
                if (letters[i] == letters[letters.length - (i + 1)]) result++;
                else break;
            }

        }

        return result;
    }


}
