import java.util.Scanner;

public class roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        double a1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        double a2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println(a1);
        System.out.println(a2);
    }
}