package org.example;

import java.util.Arrays;

public class Sorter {
    public static String sort(String word) {
        char[] sorted = word.toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }
}
