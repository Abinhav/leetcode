// Last updated: 14/07/2026, 13:59:23
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set=new HashSet<>();
        String c="";
        for(char x:s.toCharArray()){
            if(set.contains(x)){
                c+= x;
                break;
            }
            set.add(x);
        }
        return c.charAt(0);
    }
}