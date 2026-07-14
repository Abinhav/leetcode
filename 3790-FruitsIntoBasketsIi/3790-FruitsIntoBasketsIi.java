// Last updated: 14/07/2026, 13:58:58
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    break;
                }
            }
        }
        int c=0;
        for(int x:baskets){
          if(x!=0){
            c++;
          }
        }
        return c;
    }
}