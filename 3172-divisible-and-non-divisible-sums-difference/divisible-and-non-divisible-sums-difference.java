class Solution {
    public int differenceOfSums(int n, int m) {
        int sumDivisible = 0;

        // Sum of numbers divisible by m from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisible += i;
            }
        }

        // Total sum from 1 to n using formula
        int totalSum = n * (n + 1) / 2;

        // Difference
        int ans = totalSum - sumDivisible;
        return ans- sumDivisible;
    }
}
