// Last updated: 14/07/2026, 14:03:31
class Solution {
    public String intToRoman(int num) {
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String rom[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder str=new StringBuilder();
        for(int i=0;i<val.length;i++){
            while(num>=val[i]){
                str.append(rom[i]);
                num-=val[i];
            }
        }
        return str.toString();
    }
}