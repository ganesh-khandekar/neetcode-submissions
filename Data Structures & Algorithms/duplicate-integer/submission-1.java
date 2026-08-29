class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.isEmpty()){
            return false;
        }
        Hashtable<Integer, Boolean> flag = new Hashtable<>();
        flag.put(nums[0],true);

        for(int i=1; i<nums.length;i++){
            if(!flag.containsKey(nums[i])){
                flag.put(nums[i],true);
            }else{
                return true;
            }
        }
        return false ;
    }
}