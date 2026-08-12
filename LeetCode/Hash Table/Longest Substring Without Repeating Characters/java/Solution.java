class Solution {
    public int lengthOfLongestSubstring(String s) {
        char c[]=s.toCharArray();
        int n=c.length;
        int o=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String s1="";
                for(int k=i;k<=j;k++){
                    s1+=c[k];
                }
                int t=1;
                for(int l=0;l<s1.length()-1;l++){
                    for(int m=l+1;m<s1.length();m++){
                        if(s1.charAt(l)==s1.charAt(m)){
                            t=0;
                            break;
                        }
                    }
                    if(t==0){
                        break;
                    }
                }
                if(t==1){
                    if(s1.length()>o){
                        o=s1.length();
                    }
                }
            }
        }
        return o;
    }
}