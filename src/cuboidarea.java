import java.util.Scanner;

public class cuboidarea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int area = 2*a*b+2*b*c+2*a*c;
        System.out.println(area);
    }
}
