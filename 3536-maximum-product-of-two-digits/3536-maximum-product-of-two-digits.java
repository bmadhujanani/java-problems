import java.util.ArrayList;
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> num=new ArrayList<>();
        int temp=0;
        
        while (n>0){
            temp=n%10;
            num.add(temp);
            n=n/10;
        }


        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;

        for(int i=0;i<num.size();i++){
            if(num.get(i)>first_max){
                second_max=first_max;
                first_max=num.get(i);
            }
            else if(num.get(i)>=second_max){
                second_max=num.get(i);
            }
            
        }
        if(second_max==Integer.MIN_VALUE){
            return 0;
        }
        else{
        return first_max*second_max;
        }
    }
}