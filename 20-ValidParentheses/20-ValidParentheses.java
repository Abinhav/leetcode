// Last updated: 14/07/2026, 14:03:26
class Solution {
    public boolean isValid(String a) {
       Stack<Character> s=new Stack<>();
       for(char x:a.toCharArray()){
        if(x=='('||x=='['||x=='{'){
            s.push(x);
        }
        else{
            if(s.isEmpty()){
                return false;
            }
            char top=s.pop();
            if(x==')'&&top!='('||x==']'&&top!='['||x=='}'&&top!='{'){
                return false;
            }
        }
       }
       return s.isEmpty();
    }
}