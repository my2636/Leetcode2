package String;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] op = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(op));
    }
    static public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            X = operations[i].contains("+") ? X + 1 : X - 1;
        }
        return X;
    }
}
