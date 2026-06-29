class Solution {
    public int maxNumberOfBalloons(String text) {
        String need = "balloon";
        int freq[] = new int[26];
        freq['b' - 'a'] = 1;
        freq['a' - 'a'] = 1;
        freq['l' - 'a'] = 2;
        freq['o' - 'a'] = 2;
        freq['n' - 'a'] = 1;

        int freq2[] = new int[26];

        for(int i=0;i<text.length();i++){
            freq2[text.charAt(i)-'a']++;
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                int num = freq2[i] / freq[i];
                res = Math.min(num , res);
            }
        }
        if(res == Integer.MAX_VALUE){
            return 0;
        }
        return res;

    }
}