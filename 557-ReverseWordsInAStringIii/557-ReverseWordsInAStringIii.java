// Last updated: 14/07/2026, 14:01:18
class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        String w="";
        String n="";
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i) ;
           if(c!=' '){
            w+=c;
           }else{
            char[] arr = w.toCharArray();   // string → char array
                int l = 0;
                int r = arr.length - 1;

                while (l < r) {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }

                n = n + new String(arr) + " ";
                       w="";
           }
        }
        n=n.trim();
        return n;
    }
}