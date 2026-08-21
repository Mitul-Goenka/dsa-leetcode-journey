class Solution {
    void fun(String digits , int n , int idx , StringBuilder diary ,  List<String> res){
        if(idx==n){
            res.add(diary.toString());
            return;
        }
    HashMap<Character , String> map = new HashMap<>();
    map.put('2' , "abc");
    map.put('3' , "def");
    map.put('4' , "ghi");
    map.put('5' , "jkl");
    map.put('6' , "mno");
    map.put('7' , "pqrs");
    map.put('8' , "tuv");
    map.put('9' , "wxyz");
        String choice = map.get(digits.charAt(idx));
        for(int j=0;j<choice.length();j++){
            diary.append(choice.charAt(j));
            fun(digits , n , idx+1 , diary , res);
            diary.deleteCharAt(diary.length()-1);
        }
        return;
    }
    public List<String> letterCombinations(String digits) {
    // HashMap<Character , String> map = new HashMap<>();
    // map.put('2' , "abc");
    // map.put('3' , "def");
    // map.put('4' , "ghi");
    // map.put('5' , "jkl");
    // map.put('6' , "mno");
    // map.put('7' , "pqrs");
    // map.put('8' , "tuv");
    // map.put('9' , "wxyz");

    int n = digits.length();
    int idx = 0;
    StringBuilder diary = new StringBuilder();
    List<String> res = new ArrayList<>();
    fun(digits , n , idx , diary , res);
    return res;
    }
}