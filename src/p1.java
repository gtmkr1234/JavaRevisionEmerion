import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a  = s.nextInt();
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("Sum is "+ sum);
    }
}
