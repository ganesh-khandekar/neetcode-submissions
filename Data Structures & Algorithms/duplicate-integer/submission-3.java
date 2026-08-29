class Solution {
    public boolean hasDuplicate(int[] nums) {
       if(nums.length==0){
            return false;
        }
        HashSet<Integer> flag = new HashSet<>();
        flag.add(nums[0]);

        for(int i=1; i<nums.length;i++){
            if(!flag.contains(nums[i])){
                flag.add(nums[i]);
            }else{
                return true;
            }
        }
        return false ;
   
    }
}