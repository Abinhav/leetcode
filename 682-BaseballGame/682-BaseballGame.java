// Last updated: 14/07/2026, 14:00:58
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(String x:operations){
            if(x.equals("+")){
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
            }
            else if(x.equals("D")){
                s.push(2*s.peek());
            }
            else if(x.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(x));
            }
        }
        int sum=0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}