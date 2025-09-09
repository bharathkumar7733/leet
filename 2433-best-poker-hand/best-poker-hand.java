

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        // Check for Flush: all suits are the same
        boolean isFlush = true;
        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                isFlush = false;
                break;
            }
        }
        if (isFlush) return "Flush";

        // Count frequency of each rank
        Map<Integer, Integer> rankCount = new HashMap<>();
        for (int rank : ranks) {
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        // Find the highest frequency
        int maxFreq = 0;
        for (int freq : rankCount.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        if (maxFreq >= 3) return "Three of a Kind";
        if (maxFreq == 2) return "Pair";
        return "High Card";
    }
}
