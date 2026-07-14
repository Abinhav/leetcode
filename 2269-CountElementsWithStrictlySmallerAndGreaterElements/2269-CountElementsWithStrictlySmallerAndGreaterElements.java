// Last updated: 14/07/2026, 13:59:31
class Solution {
    public int countElements(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            int l=0;
            for(int j=0;j<arr.length;j++){
              if(arr[i]>arr[j]){
                l++;
              }
              if(arr[i]<arr[j]){
                s++;
              }
            }
            if(s!=0&&l!=0){
                c++;
            }
        }
        return c;
    }
}