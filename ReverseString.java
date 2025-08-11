package com.palle;

public class ReverseString {
	public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Before reversing:");
        for (char c : s) {
            System.out.print(c + " ");
        }
        solution.reverseString(s);
        System.out.println("\nAfter reversing:");
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}




