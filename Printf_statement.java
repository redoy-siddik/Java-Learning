import java.util.*;
public class Printf_statement {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_CYAN);

        String name = "Spongebob";
        char firt_latter = 'S';
        int age = 20;
        double height = 5.8;
        boolean isEmployed = true;

        System.out.printf("Hello %s.\n",name);
        System.out.printf("Your name starts with %s.\n",firt_latter);
        System.out.printf("Your are %d years old.\n",age);
        System.out.printf("Your height is %.2f.\n",height);
        System.out.printf("Employed: %b.\n",isEmployed);
        System.out.printf("Hi %s, you are %d years old, %.2f feet tall.\n",name,age,height);

        double pi = 3.14159265358979323846;
        double a = 12000.34;
        double b = -99000.59;
        System.out.printf("Pi: %,+.2f\n",pi);
        System.out.printf("a: %,+.2f\n",a);
        System.out.printf("b: %,+.2f\n",b);
        System.out.printf("b: %,(.2f\n",b);

        double c = -123456.789;
        double d = 123.4578;
        System.out.printf("c: % ,.2f\n",c);
        System.out.printf("d: % ,.2f\n",d);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        System.out.printf("%c%c%c\n",str1.charAt(0),str2.charAt(0),str3.charAt(0));
        sc.close();
    }
}
