package com.qa.token;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TokeniserTest {

    @Test
    void testReturnBlank() {
        // arrange (setup test data)
        String input = "";
        String[] expectedOutput = {};
        // Component Under Test
        Tokeniser cut = new Tokeniser();
        // act (call the method being tested)
        String[] actualOutput = cut.tokenise(input);
        // assert (check the expected output vs the actual)
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }


    @Test
    void testReturnSingleTag() {
        // arrange (setup test data)
        String input = "Java";
        String[] expectedOutput = {"Java"};
        // Component Under Test
        Tokeniser cut = new Tokeniser();
        // act (call the method being tested)
        String[] actualOutput = cut.tokenise(input);
        // assert (check the expected output vs the actual)
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReturnTwoTags() {
        // arrange (setup test data)
        String input = "Java, C#";
        String[] expectedOutput = {"Java", "C#"};
        // Component Under Test
        Tokeniser cut = new Tokeniser();
        // act (call the method being tested)
        String[] actualOutput = cut.tokenise(input);
        // assert (check the expected output vs the actual)
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}
