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



//         Program to find a prime number or not
//        int num = s.nextInt();
//        boolean r = true;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//
//            if(num%i==0) {
//                r = false;
        //        break;
//            }
//        }
//        System.out.println(r?"Prime Number":"Not a prime num");


//        //HCF of two Numbers
//        int a = s.nextInt(), b = s.nextInt();
//        int res =1;
//        for (int i = Math.min(a,b); i >= 2; i--) {
//            if(a%i==0 && b%i==0){
//                res = i;
//                break;
//            }
//        }
//        System.out.println(res);


//        // Calculate Binary to decimal
//        int a = s.nextInt();
//        int res =0;
//        int i=0;
//        while(a>0){
//            res = (int) (res + a%10*Math.pow(2,i++));
//            a/=10;
//        }
//        System.out.println(res);


        // Strong Number
        int b = s.nextInt();
        int a=b;
        int res = 0;
        while(a>0){
            res+= fact(a%10);
            a/=10;
        }
        System.out.println(res==b?"Strong":"Weak"+" Number");
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
