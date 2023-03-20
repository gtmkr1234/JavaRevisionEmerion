import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a>0){
            System.out.println("Pos");
        }
        else if (a<0){
            System.out.println("Neg");
        }
        else{
            System.out.println("Zero");
        }
    }
}
