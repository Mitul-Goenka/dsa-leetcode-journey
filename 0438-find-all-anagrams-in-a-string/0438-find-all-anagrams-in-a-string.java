class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int k = p.length();
        int count = p.length();
        int freq[] = new int[26];
        for(int i=0;i<p.length();i++){
           freq[p.charAt(i) - 'a']++;
        }
        while(right<s.length()){
            if(freq[s.charAt(right)-'a']>0){
                count--;
            }
            freq[s.charAt(right)-'a']--;
            if(right-left+1==k){
                if(count==0){
                    list.add((left));
                }
               freq[s.charAt(left)-'a']++;
               if(freq[s.charAt(left)-'a']>0){
                count++;
            }
           left++;
        }
            right++;
        }
        return list;
    }
}