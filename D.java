import java.util.*;
class D{
	public static void main(String [] a)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter how many fibonacci:");
		n = sc.nextInt();
		int s1=0,s2=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(s2+" ");
			int temp=s2;
			s2=s1+s2;
			s1=temp;
		}
		sc.close();
	}
}