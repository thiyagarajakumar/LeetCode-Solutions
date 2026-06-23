class Solution {
    public String firstPalindrome(String[] words) {
    for(int i=0;i<words.length;i++){
        String s=new StringBuilder(words[i]).reverse().toString();
        if(s.equals(words[i]))
        {
            return s.toString();
        }}
String se="";
return se;
        
    }
}