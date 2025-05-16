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
        return toPigLatinTail(input, 0);
    }

    // Tail-recursive helper
    private static String toPigLatinTail(String input, int idx) {
        if (input == null || input.isEmpty()) return input;
        if (idx >= input.length()) return input + "ay";
        char c = Character.toLowerCase(input.charAt(idx));
        if (vowels.contains(c)) {
            if (idx == 0) {
                return input + "ay";
            } else {
                return input.substring(idx) + input.substring(0, idx) + "ay";
            }
        }
        return toPigLatinTail(input, idx + 1);
    }

    public static void main(String[] args) {
        List<String> words = List.of("pig", "latin", "smile", "string", "eat");

        System.out.println(words.stream()
                .map(PigLatin::toPigLatin)
                .collect(Collectors.toList()));
    }
}


