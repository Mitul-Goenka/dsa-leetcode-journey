class Solution {
    public int maxVowels(String s, int k) {
        int max_count = 0;
        int low = 0;
        int high = 0;
        int count = 0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        max_count = count;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
            if(s.charAt(low)=='a' || s.charAt(low)=='e' || s.charAt(low)=='i' || s.charAt(low)=='o' || s.charAt(low)=='u'){
                count--;
            }
            max_count = Math.max(max_count , count);
            low++;
        }
        return max_count;
    }
}