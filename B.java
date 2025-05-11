import java.util.*;
class B{
	public static void main(String [] a)
	{
		Scanner sc = new Scanner(System.in);
		int n,t;
		System.out.print("Enter no:");
		n = sc.nextInt();
		System.out.print("Enter Time:");
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n);
			}
			System.out.print("\n");
		}
		sc.close();
	}
}