class Solution {
    public int secondHighest(String s) {
        String num="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num+s.charAt(i);
                count++;
            }
        }
        int[] arr=new int[count]; 
        for(int i=0;i<count;i++){
            arr[i]=num.charAt(i)-'0';
        }
        
        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first_max){
                second_max=first_max;
                first_max=arr[i];
            }
            else if(arr[i]!=first_max && arr[i]>=second_max){
                second_max=arr[i];
            }
        }
        if(second_max==Integer.MIN_VALUE){
            return -1;
        }
        else{
        return second_max;
        }
    }
}