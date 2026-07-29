class Solution {
    List<List<Integer>> res =new ArrayList<>();
    List<Integer> index =new ArrayList<>();
    void travel(int[] nums ,List<Integer> arr,int k){
        if(arr.size()==nums.length){
            res.add(new ArrayList(arr));
            return;
        }
        for(int i=k;i<nums.length;i++){
            if(index.contains(i)){
                continue;
            }
            arr.add(nums[i]);
            index.add(i);
            travel(nums,arr,0);
            arr.removeLast();
            index.removeLast();
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        travel(nums,new ArrayList<>(),0);
        return res;
    }
}
