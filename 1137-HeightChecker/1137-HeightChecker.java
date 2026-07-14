// Last updated: 14/07/2026, 14:00:23
class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
      int[] arr = Arrays.copyOf(heights, heights.length);
        int n=heights.length;
        for(int i=n-1;i>=0;i--){
            int a=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    a++;
                }
            }
            if(a==0){
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(heights[i]!=arr[i]){
                c++;
            }
        }
        return c;
    }
}