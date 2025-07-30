package com.qa.token;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Tokeniser {



    public String[] tokenise(String input) {
        StringTokenizer tokeniser = new StringTokenizer(input, ",");
        List<String> tags = new ArrayList<>();

        while (tokeniser.hasMoreTokens()) tags.add(tokeniser.nextToken().trim());


        return tags.toArray(new String[0]);
    }

}
