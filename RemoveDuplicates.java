package com.palle;

import java.util.Arrays;

public class RemoveDuplicates {
	 public int removeDuplicates(int[] nums) {
	        Arrays.sort(nums); // Sort the array
	        
	        int k = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }
	        
	        for (int i = 0; i < k; i++) {
	            System.out.println(nums[i]);
	        }
	        
	        return k;
	    }

	    public static void main(String[] args) {
	        RemoveDuplicates rd = new RemoveDuplicates();
	        int[] nums = {1, 2, 3, 2, 1, 4, 5, 6, 4, 6};
	        rd.removeDuplicates(nums);
	    }
	}



        