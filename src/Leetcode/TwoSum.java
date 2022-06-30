package Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }
    public int[] twoSum(int[] nums, int target) {
        bubbleSort(nums);
    }

    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

        }
    }
}
