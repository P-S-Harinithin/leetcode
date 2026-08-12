class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int x1=x;
        int n,sum=0;
        while(x!=0){
            n=x%10;
            sum=sum*10+n;
            x=x/10;
        }
        return x1==sum;
    }
}