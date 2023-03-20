import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a= s.next().charAt(0);
//        System.out.println((int)a);
        if(a>='a' && a<='z'|| a>='A' && a<='Z'){
            System.out.println(a+" is Alphabet");
        }
        else{
            System.out.println(a+" is not Alphabet");
        }
    }

}
