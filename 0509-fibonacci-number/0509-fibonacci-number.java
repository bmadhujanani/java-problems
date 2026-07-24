class Solution {
    public int fib(int n) {
        int first=0;
        int second=1;
        if(n==0){
            return 0;
        }
        else{
        for(int i=1;i<n;i++){
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
        }
        return second;
    }
}