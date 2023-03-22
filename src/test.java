import javax.swing.table.TableCellRenderer;

public class test {
    public static void main(String[] args) {
//        int i =11;
//        i=i++ + ++i;
//        System.out.println(i);
//        int a = 11, b=22,c;
//        c=a+b + a++ + b++ + ++a + ++b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        13
//        24
//        103
//    boolean b = true;
//    b++;
//        System.out.println(b);
//        java: bad operand type boolean for unary operator '++'
//        int a=1, b=2;
//        System.out.println(--b - ++a+ ++b - --a);
//        0

//        int i=11;
//        int j = --(i++);
//        java: unexpected type
//        required: variable
//        found:    value

//        int a=1;
//        a=a++ + ++a * --a - a--;
//        System.out.println(a);
//        5


//        int x = 001, y=010, z=100;
//        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(i);
//        -2
//        9
//        98
//                -167

//        int ch = 'A';
//        System.out.println(ch++);
//        65

//        char ch = 'A';
//        System.out.println(++ch);
//        B

//        char ch = "123".charAt(1);
//        System.out.println(ch++ + ++ch);
//        // 102 the ascii values gets added 50(51) + 52 = 102
//
        int i=0, j=0;
        System.out.println(--i * i++ * ++j * j++);
    }
}
