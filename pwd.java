import java.io.Console;

class pwd {
public static void main(String[] args) {
    Console c = System.console();
    try {
        char[] p =  c.readPassword();
        System.out.print(p);
    } catch (Exception e) {
        System.out.print(e);
    }
}
}