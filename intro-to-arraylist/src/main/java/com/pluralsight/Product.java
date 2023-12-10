package com.pluralsight;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3};

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("================");
        for(int num: nums){
            System.out.println(num);
        }
    }
}
