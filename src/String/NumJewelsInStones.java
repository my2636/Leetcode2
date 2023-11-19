package String;

public class NumJewelsInStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("mnk", "mMnl"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < j.length; i++) {
            int count1 = 0;
            for (int k = 0; k < s.length; k++) {
                count1 = j[i] == s[k] ? count1 + 1 : count1;
            }
            count += count1;
        }
        return count;
    }
}
