import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(nums[0],0);
        int len = nums.length;
        for(int i = 1;i<len;i++) {
            if(hashmap.containsKey(target-nums[i])) {
                return new int[]{hashmap.get(target-nums[i]),i};
            }
            hashmap.put(nums[i],i);
        }
        return null;
        // for(int i =0;i<nums.length;i++){
        //     int j = i+1;
        //     while(j<nums.length){
        //         if(nums[i]+nums[j]==target) {
        //             int[] array = {i,j};
        //             return array;
        //         }
        //         j++;
        //     }
        // }
        // return null;
    }
}