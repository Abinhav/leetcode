// Last updated: 14/07/2026, 13:59:17
class Solution {
    public int countDigits(int num) {
        int c=0;
        int a=num;
        while(a!=0){
            int temp=a%10;
            if(num%temp==0){
                c++;
            }
            a/=10;
        }
        return c;
    }
}