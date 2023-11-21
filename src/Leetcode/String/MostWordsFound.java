package Leetcode.String;

public class MostWordsFound {
    public static void main(String[] args) {
        String[] array = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(array));
    }
    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] splittedElement = sentences[i].split(" ");
            if (splittedElement.length > count) {count = splittedElement.length;}
        }
        return count;
    }
}
