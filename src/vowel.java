import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if(a>='a' && a<='z'){
            System.out.println("Alphabet");
        }
        else if(a>='0' && a<='9'){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Character");
        }
    }
}