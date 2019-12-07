package com.ly.wrapperClass;

/**
 * 冒泡排序
 */
public class WrapperClass2 {
    public static void main(String[] args) {
        int[] nums = {25,58,12,56,99,5};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 -i ; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int arr:nums) {
            System.out.print(arr+"\t");
        }
    }
}
