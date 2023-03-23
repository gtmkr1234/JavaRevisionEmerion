import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        int x=0;
        while(x<=n){
            System.out.println(x++);
        }
    }
}
