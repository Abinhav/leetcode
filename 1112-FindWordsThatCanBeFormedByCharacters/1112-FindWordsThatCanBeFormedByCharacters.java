// Last updated: 14/07/2026, 14:00:25
import java.util.*;

class Solution {
    public int countCharacters(String[] words, String chars) {

        HashMap<Character, Integer> charsMap = new HashMap<>();

        // Store frequency of chars
        for (char ch : chars.toCharArray()) {
            charsMap.put(ch, charsMap.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;

        for (String word : words) {

            HashMap<Character, Integer> wordMap = new HashMap<>();

            // Store frequency of current word
            for (char ch : word.toCharArray()) {
                wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
            }

            boolean good = true;

            // Compare frequencies
            for (char ch : wordMap.keySet()) {
                if (wordMap.get(ch) > charsMap.getOrDefault(ch, 0)) {
                    good = false;
                    break;
                }
            }

            if (good) {
                ans += word.length();
            }
        }

        return ans;
    }
}