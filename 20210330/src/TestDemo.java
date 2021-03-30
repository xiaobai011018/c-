import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int right = nums.length/2+1;
        int left = nums.length/2-1;
        int num = nums[nums.length/2];
        while(right<nums.length&&nums[right]==num) {
            right++;
        }
        right--;
        while(left>=0&&nums[left]==num) {
            left--;
        }
        left++;
        if(right-left+1>nums.length/2) {
            return num;
        }
        return -1;


    }
}
public class TestDemo {
    public static void main(String[] args) {
        int a.3 = 10;
    }
}
