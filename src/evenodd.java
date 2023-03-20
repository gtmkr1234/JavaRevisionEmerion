import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}
