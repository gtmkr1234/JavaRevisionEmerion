import java.util.Scanner;

public class new2703 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        //reverse
//        int a = s.nextInt();
//        int res =0;
//        while(a>0){
//            res = 10*res + a%10;
//            a = a/10;
//        }
//        System.out.println(res);


        //Print the sum of the digits
        int a = s.nextInt();
        int res=0;
        while(a>0){
            res += a%10;
            a/=10;
        }
        System.out.println(res);
    }
}
