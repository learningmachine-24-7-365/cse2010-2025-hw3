package cse2010.hw3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {
    static List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    /**
     * Convert a word to Pig Latin
     *
     * @param input the word to convert
     * @return the word in Pig Latin
     */
    public static String toPigLatin(String input) {
        /*
         * Complete codes here ...
         */
        return null; // modify this line if necessary
    }

    public static void main(String[] args) {
        List<String> words = List.of("pig", "latin", "smile", "string", "eat");

        System.out.println(words.stream()
                .map(PigLatin::toPigLatin)
                .collect(Collectors.toList()));
    }
}


