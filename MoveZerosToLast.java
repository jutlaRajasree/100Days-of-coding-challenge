package com.palle;

public class MoveZerosToLast {
	 public void moveZeroes(int[] nums) {
	        int slow = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                int temp = nums[slow];
	                nums[slow] = nums[i];
	                nums[i] = temp;
	                slow++;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        MoveZerosToLast solution = new MoveZerosToLast();
	        int[] nums = {0, 1, 0, 3, 12};
	        System.out.println("Before moving zeroes:");
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	        solution.moveZeroes(nums);
	        System.out.println("\nAfter moving zeroes:");
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
	}



