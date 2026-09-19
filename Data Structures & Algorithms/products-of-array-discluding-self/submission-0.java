class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1,count =0;
        boolean flag= false;
        for( int i : nums ){
            if(i!= 0){
                product = product *i;
            }else{
                count++;
                flag = true;
            }
        }

        if(count>=2){
            return new int[nums.length];
        }
         for( int i=0; i<nums.length;i++ ){
           if(flag && nums[i]== 0){
            nums[i]= product;
            }else if (!flag){
                nums[i]= product/nums[i];
            }else {
                nums[i] =0;
            }
         }
        return nums;

    }
}  
