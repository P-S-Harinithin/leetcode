class Solution {
    public String longestPalindrome(String s) {
                 char c[]=s.toCharArray();
         String l="";int l1=0;
         int n=c.length;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String d="";
                for(int k=i;k<=j;k++){
                    d+=c[k];
                
                }
                StringBuilder sb=new StringBuilder(d);
               String d1=sb.reverse().toString();
                if(d1.equals(d)){
                    if(d.length()>l1){
                        l1=d.length();
                        l=d;
                    }
                }
            }
         }
         return l;
    }
}