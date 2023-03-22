import java.util.Scanner;

public class typetriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        if((a==b)&&(b==c)){
            System.out.println("Equilateral");
        }
        else if((a==b)||(b==c)||(c==a)){
            System.out.println("Isosclene");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
