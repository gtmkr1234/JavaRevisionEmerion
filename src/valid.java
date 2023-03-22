import java.util.Scanner;

public class valid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a<b+c && b<a+c && c<b+a){
            System.out.println("Is a Triangle");
        }
        else{
            System.out.println("Not a Triangle");
        }
    }
}
