import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int fivehun = a/500;
        int hun = (a%500)/100;
        int fifty = ((a%500)%100)/50;
        int twenty = (((a%500)%100)%50)/20;
        int ten = ((((a%500)%100)%50)%20)/10;
        System.out.println("five hundred : "+fivehun);
        System.out.println("hundred : "+hun);
        System.out.println("fifty : "+fifty);
        System.out.println("twenty : "+twenty);
        System.out.println("ten : "+ten);
    }
}
