class Solution {
    List<String> fun(int open , int close , int n , StringBuilder temp , List<String> list){
        if(open==n && close==n){
            list.add(temp.toString());
            return list;
        }
        if(open<n){
            temp.append('(');
            fun(open+1 , close, n , temp , list);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close<open){
            temp.append(')');
            fun(open , close+1 , n , temp , list);
            temp.deleteCharAt(temp.length()-1);
        }
        return list;
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder temp = new StringBuilder();
        List<String> list = new ArrayList<>();
        return fun(0 , 0 , n , temp , list);
    }
}