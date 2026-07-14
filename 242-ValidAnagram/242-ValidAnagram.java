// Last updated: 14/07/2026, 14:02:08
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())        {
        return false;
       }
       char[] a=s.toCharArray();
       char[] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       boolean bool=true;
       for(int i=0;i<s.length();i++){
        if(a[i]!=b[i]){
          
            return false;
        }
       }
       return true;
    }
}