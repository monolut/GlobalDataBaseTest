package org.example;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java -cp target/classes org.example.AnagramFinder <path_to_file>");
            return;
        }

        String filePath = args[0];
        HashMap<String, List<String>> map = AnagramService.find(filePath);
        Printer.print(map);
    }
}
