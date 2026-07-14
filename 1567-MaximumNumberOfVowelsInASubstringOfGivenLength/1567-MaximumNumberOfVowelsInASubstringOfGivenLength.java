// Last updated: 14/07/2026, 14:00:01
class Solution {
    public int maxVowels(String s, int k) {

      int c=0;
      for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            c++;
        }
      }
      int max=c;
      int l=0;
      for(int r=k;r<s.length();r++){
        char ch=s.charAt(r);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            c++;
        }
        char cl=s.charAt(l);
        if(cl=='a'||cl=='e'||cl=='i'||cl=='o'||cl=='u'){
            c--;
        }
        max=Math.max(max,c);
        l++;
      }
      return max;
    }
}