import java.lang.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        int x = sc.nextInt(); // It only accepts data without decimal places
//        String x = sc.next(); // It scans till the blank character
        String x = sc.nextLine(); // It scans till the next Line
        System.out.println(x);
    }
}