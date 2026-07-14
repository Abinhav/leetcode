// Last updated: 14/07/2026, 13:59:00
class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> low=new HashSet<>();
        Set<Character> high=new HashSet<>();
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)){
                low.add(c);
            }
            else{
                high.add(c);
            }
        }
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(low.contains(ch)&&high.contains(Character.toUpperCase(ch))){
                count++;
            }
        }
        return count;
    }
}