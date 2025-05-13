import java.util.*;
public class A_Dr_TC {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int one=0,zero=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='1') one++;
                else zero++;
            }
            if(one==0)
            {
                System.out.println(zero);
            }
            else if(zero==0)
            {
                System.out.println(one*(one-1));
            }
            else
            {
                System.out.println((one*(one-1))+((1+one)*zero));
            }
        }
        sc.close();
    }
}