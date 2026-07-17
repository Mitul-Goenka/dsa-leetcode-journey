class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
            for(int j=0;j<strs[0].length();j++){
                for(int i=1;i<strs.length;i++){
                   if(j>=strs[i].length() || strs[0].charAt(j)!=strs[i].charAt(j)){
                return strs[0].substring(0,j);
                   } 
                }
            }
            return s;
    }
}