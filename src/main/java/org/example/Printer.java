package org.example;

import java.util.HashMap;
import java.util.List;

public class Printer {

    public static void print(HashMap<String, List<String>> map) {
        for (List<String> value : map.values()) {
            System.out.print(String.join(" ", value));
            System.out.println();
        }
    }
}
