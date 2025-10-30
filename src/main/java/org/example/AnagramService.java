package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramService {
    public static HashMap<String, List<String>> find(String filePath) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while((line = reader.readLine()) != null) {
                line = line.trim().toLowerCase();
                if(line.isEmpty()) continue;
                String sorted = Sorter.sort(line);
                anagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(line);
            }
        } catch(IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return anagrams;
    }
}
