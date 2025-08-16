package com.palle;

public class RemoveDuplicateCharsFromStringByUsingStringBuilder {
	public static void main(String[] args) {
        String str = "Programming";
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}




