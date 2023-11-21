package Leetcode.String;

public class Interpret {
    public static void main(String[] args) {

        System.out.println(interpret("GG()()()()(al)"));
    }
    public static String interpret(String command) {
        int i = 0;
        String res = "";
        while (i < command.length()) {
            if (command.startsWith("G")) {
                res += "G";
                command = command.replaceFirst("G", "");
            } else if (command.startsWith("()")) {
                res += "o";
                command = command.replaceFirst("\\(" + "\\)", "");
            } else if (command.startsWith("(al)")) {
                res += "al";
                command = command.replaceFirst("\\(al" + "\\)", "");
            }
        }
        return res;
    }
}
