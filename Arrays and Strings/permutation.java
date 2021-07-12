// Given two strings write a method to decide if one is permutation of other.

import java.util.Arrays; //This class contains a static factory that allows array to be viewed as lists.

public class permutation {
    //Method to sort the string 
    public static String sort(String str1) {
        char[] content = str1.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean checkpermutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }
    public static void main(String[] args) {
        System.out.println(checkpermutation("hello","world"));
    }

}