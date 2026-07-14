// Last updated: 14/07/2026, 14:00:42
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        Arrays.sort(people);
        int l=0,r=people.length-1;
        int sum=0;
       while(l<=r){
        if(people[l]+people[r]<=limit){
                 l++;
        }
        r--;
        c++;
       }
       return c;
    }
}