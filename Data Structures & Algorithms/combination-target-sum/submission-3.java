class Solution {
    List<List<Integer>> res =new ArrayList<>();
    boolean  addfun(List<Integer> arr){
        if(res.contains(arr)){
            return false;
        }
        res.add( new ArrayList<>());
        for(Integer i: arr){
            res.getLast().add(i);
        }
        return true;
    }
    boolean combinationOfSum(int target ,List<Integer> arr,int[] nums,int i){
        if(res.contains(arr)){
            return false;
        }else if(0==target){
            System.out.println(arr);

            addfun(arr);
            return true;
        }if(0>target){
            return false;
        } if(i==nums.length){
            return false;
        }
        arr.add(nums[i]);
        combinationOfSum((target-nums[i]),arr,nums,(i));
        combinationOfSum((target-nums[i]),arr,nums,(i+1));
       arr.removeLast();
        // System.out.println("remove then "+arr);

        combinationOfSum((target),arr,nums,(i+1));
        return true;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int i=0;
       List<Integer> arr =new ArrayList<>();
        arr.add(nums[i]);
        combinationOfSum((target-nums[i]),arr,nums,(i));
        combinationOfSum((target-nums[i]),arr,nums,(i+1));
        // System.out.println("remove then "+arr);
       arr.removeLast();
        // System.out.println("remove then "+arr);
        combinationOfSum((target),arr,nums,(i+1));
        return res;
    }
}
