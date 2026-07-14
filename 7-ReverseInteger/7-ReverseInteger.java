// Last updated: 14/07/2026, 14:03:35
class Solution {
    public int reverse(int x) {
      int d=0;
      int rev=0;
      while(x!=0)  {
        d=x%10;
        x/=10;
        if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }
        rev=(rev*10)+d;
        
      }
      return rev;
    }
}