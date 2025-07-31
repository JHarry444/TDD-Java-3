package com.s2s.palindrome;

public class Palindrome {
    private class Result {
        private String inputString;
        private int count = 0;

        public Result(String inputString, int initCount) {
            this.inputString = inputString;
            count = initCount;
        }

        public Result(Result inputValues) {
            this.count = inputValues.count;
            this.inputString = inputValues.inputString;
        }
    }

    public int isPalindrome(String inputString) {
        int result = 0;

        if (inputString.length() == 0) {
            result = 1;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            if (firstChar == lastChar) {
                Result tempResult = new Result(mid, 1);
                isPalindrome(tempResult);
                result = tempResult.count;
            }
        }
        return result;
    }

    private void isPalindrome(Result inputValues) {
        if (inputValues.inputString.length() > 0) {
            char firstChar = inputValues.inputString.charAt(0);
            char lastChar = inputValues.inputString.charAt(inputValues.inputString.length() - 1);
            String mid = inputValues.inputString.substring(1, inputValues.inputString.length() - 1);
            if (firstChar == lastChar) {
                inputValues.count++;
                inputValues.inputString = mid;
                isPalindrome(inputValues);
            }
        }
    }
}
