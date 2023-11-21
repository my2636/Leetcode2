package Leetcode.String;

public class BalancedStringSplit {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R' ) {
                count++;
            } else {
                count1++;
            }
            if (count == count1) {
                count2++;
            }
        }
        return count2;
    }
}
