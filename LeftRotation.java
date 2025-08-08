package com.palle;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int n = 3;

	        n = n % arr.length; 
	        int[] newArr = new int[arr.length];

	        
	        for (int i = n; i < arr.length; i++) {
	            newArr[i - n] = arr[i];
	        }

	        
	        for (int i = 0; i < n; i++) {
	            newArr[arr.length - n + i] = arr[i];
	        }

	      
	        for (int num : newArr) {
	            System.out.print(num + " ");
	        }
	    }
	}


	