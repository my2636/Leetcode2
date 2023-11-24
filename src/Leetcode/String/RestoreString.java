package Leetcode.String;

import java.util.Arrays;

public class RestoreString {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet", arr));
    }
    public static String restoreString(String s, int[] indices) {
        char[] arr1 = new char[s.length()];
        String s1 = "";
        for (int i = 0; i < arr1.length; i++) {
            arr1[indices[i]] = s.charAt(i);
        }
        for (int j = 0; j < arr1.length; j++) {
            s1 += arr1[j];
        }
        System.out.println(new String(arr1));
        return s1;
    }
}
