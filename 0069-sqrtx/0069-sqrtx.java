class Solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int answer=-1;
        while(left<=right){
            int mid=(left+right)/2;
            long square=(long)mid*mid;
            if(x==square){
                return mid;
            }
            else if(square<x){
                answer=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return answer;
    }
}