package com.palle;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4, 5, 9};
		int y = 3;

		int[] newArr = new int[arr1.length - 1];
		int j = 0;

		for (int i = 0; i < arr1.length; i++) {
		    if (y != i) {
		        newArr[j] = arr1[i];
		        j++;
		    }
		}

		for (int k = 0; k < newArr.length; k++) {
		    System.out.println(newArr[k]);
		}}}

