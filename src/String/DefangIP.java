package String;

public class DefangIP {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("24.24.24.24"));
    }

    static public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}