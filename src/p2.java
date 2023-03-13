import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useRadix(2);// Used to input Binary Numbers...
        // Inside this method, the number is the base number of the input :0

        int x = s.nextInt();
        System.out.println(x);
    }
}
