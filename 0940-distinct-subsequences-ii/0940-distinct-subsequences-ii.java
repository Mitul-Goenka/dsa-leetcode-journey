class Solution {
    public int distinctSubseqII(String s) {
         final long MOD = 1000000007;
        
        long dp = 1; // includes empty subsequence
        long[] last = new long[26];

        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';

            long newDp = (2 * dp - last[idx] + MOD) % MOD;

            last[idx] = dp;
            dp = newDp;
        }

        // remove empty subsequence
        return (int) ((dp - 1 + MOD) % MOD);
    }
}