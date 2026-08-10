class Solution {
    public String reverseVowels(String s) {
        //char c[]=s.toCharArray();
        char ch[]=s.toCharArray();
         String s1="",s2="",s4="";
         for(int i=0;i<ch.length;i++){
             if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                 s1+=ch[i];
             }
             else{
            s2+=ch[i];
             }
         }
         StringBuilder s3=new StringBuilder(s1);
         s3=s3.reverse();
       //  System.out.print(s3.toString());
         int l=0;;
         char c1[]=s3.toString().toCharArray();
         for(int i=0;i<ch.length;i++){
             if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                 s4+=c1[l];l++;
             }else{
                 s4+=ch[i];
             }
         }
        
    return s4;
    }
}