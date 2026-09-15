class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        Hashtable<Integer, Integer> temp = new Hashtable<>();

        while (i < nums.length) {
            if (temp.containsKey(nums[i])) {
                temp.put(nums[i], temp.get(nums[i]) + 1);
            } else {
                temp.put(nums[i], 1);
            }
            i++;
        }

        Set<Integer> keys = temp.keySet();

        int counter = 0;
        for (Integer key : keys) {
            if (temp.get(key) >= k) {
                counter++;
            }
        }

        int[] res = new int[counter];
        i = 0;
        for (Integer key : keys) {
            if (temp.get(key) >= k) {
                res[i] = key;
                i++;
            }
        }
        return res;
    }
}
