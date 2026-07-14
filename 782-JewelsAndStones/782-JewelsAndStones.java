// Last updated: 14/07/2026, 14:00:49
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        for(char x:jewels.toCharArray()){
            set.add(x);
        }
        int c=0;
        for(char x: stones.toCharArray()){
            if(set.contains(x)){
                c++;
            }
        }
        return c;
    }
}