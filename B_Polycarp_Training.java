import java.util.*;
public class B_Polycarp_Training {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long ans = 0;
        for(int i=0;i<n;i++)
        {
            if(ans<a[i]) ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}