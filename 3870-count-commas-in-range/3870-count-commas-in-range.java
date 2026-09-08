class Solution {
    public int countCommas(int n) {
        int count = 0;
        int num = n;
        while(num>0){
            num = num/10;
            count++;
        }
        if(count>3){
            int a = 0;
            for(int i=1000;i<=n;i++){
                a++;
            }
            return a;
        }
        return 0;
    }
}