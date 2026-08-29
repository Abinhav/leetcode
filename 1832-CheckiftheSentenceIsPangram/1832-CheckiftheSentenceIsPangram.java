// Last updated: 29/08/2026, 15:24:29
1class Solution {
2    public boolean checkIfPangram(String s) {
3        HashSet<Character> set=new HashSet<>();
4        for(char x:s.toCharArray()){
5          set.add(x);
6        }
7        return set.size()==26;
8    }
9}