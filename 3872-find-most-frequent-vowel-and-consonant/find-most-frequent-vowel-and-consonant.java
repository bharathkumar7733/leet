import java.util.HashMap;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        String vowels = "aeiou";
        
        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        int maxVowel = 0;
        int maxConsonant = 0;
        
        // Find max vowel and consonant frequencies
        for (char c : freqMap.keySet()) {
            int count = freqMap.get(c);
            if (vowels.indexOf(c) >= 0) { // it's a vowel
                maxVowel = Math.max(maxVowel, count);
            } else { // consonant
                maxConsonant = Math.max(maxConsonant, count);
            }
        }
        
        return maxVowel + maxConsonant;
    }
}
