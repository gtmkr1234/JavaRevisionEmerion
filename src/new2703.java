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


//        //Print the sum of the digits
//        int a = s.nextInt();
//        int res=0;
//        while(a>0){
//            res += a%10;
//            a/=10;
//        }
//        System.out.println(res);

        int num = s.nextInt();
        boolean r = true;
        for (int i = 2; i < Math.sqrt(num); i++) {

            if(num%i==0) {
                r = false;
            }
        }
        System.out.println(r==true?"Prime Number":"Not a prime num");
    }
}
