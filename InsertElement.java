package com.palle;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
        int x = 10;
        int y = 2;

        int[] newArr = new int[arr.length + 1];
        int j = 0;

      
        for (int i = 0; i < arr.length; i++) {
            if (i == y) {
                newArr[j] = x;
                j++;
            }
            newArr[j] = arr[i];
            j++;
        }

        
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
       
        }
    }
}

