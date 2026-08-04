class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            int current=nums[i];
            while(current+1<nums[i+1]){
                list.add(current+1);
                current++;
            }

        }
        /*for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
            continue;
            }
            else{
                 list.add(nums[i]+1);
            }
        }*/
        return list;
    }
}