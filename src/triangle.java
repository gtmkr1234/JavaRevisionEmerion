import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a+b+c==180 && a>0 && b>0 && c>0){
            System.out.println("Triangle");
        }
        else{
            System.out.println("Not a Triangle");
        }
    }
}
