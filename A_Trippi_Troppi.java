import java.util.*;
public class A_Trippi_Troppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            String a,b,c;
            a = sc.next();
            b = sc.next();
            c = sc.next();
            System.out.println(a.charAt(0)+""+b.charAt(0)+c.charAt(0));
        }
        sc.close();
    }
}