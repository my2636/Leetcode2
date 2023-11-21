package Leetcode.String;

public class RestoreString {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet", arr));
    }
    public static String restoreString(String s, int[] indices) {
        for (int i = 1; i < indices.length; i++) {
            int key = indices[i];
            int j = i - 1;
            while (j >= 0 && indices[j] > key) {
                indices[j+1] = indices[i];
            }
            indices[j+1] =key;
        }
        return indices.toString();
    }
}
